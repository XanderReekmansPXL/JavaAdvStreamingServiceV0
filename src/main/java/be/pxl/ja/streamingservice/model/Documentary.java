package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {
    private String topic;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        super.setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void Play() {
        StringBuilder result = new StringBuilder();
        result.append("Playing ").append(this);
        if (topic != null) {
            result.append(" on ").append(topic);
        }
        System.out.println(result.toString());
    }

    public void Pause() {
        System.out.println("Pausing " + topic);
    }
}
