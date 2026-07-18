public class VideoStore {
    private Video[] store;

    // Adds a new video to the store inventory
    public void addVideo(String name) {
        Video newVideo = new Video(name);
        if (store == null) {
            store = new Video[]{newVideo};
        } else {
            Video[] newStore = new Video[store.length + 1];
            System.arraycopy(store, 0, newStore, 0, store.length);
            newStore[store.length] = newVideo;
            store = newStore;
        }
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    // Helper to find a video by name
    private Video findVideo(String name) {
        if (store != null) {
            for (Video video : store) {
                if (video.getName().equalsIgnoreCase(name)) {
                    return video;
                }
            }
        }
        return null;
    }

    public void doCheckout(String name) {
        Video video = findVideo(name);
        if (video != null) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideo(name);
        if (video != null) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideo(name);
        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {
        if (store == null || store.length == 0) {
            System.out.println("No videos available in inventory.");
            return;
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s | %-15s | %-10s\n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");
        for (Video video : store) {
            System.out.printf("%-20s | %-15b | %-10d\n", 
                video.getName(), video.getCheckout(), video.getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}