package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(0),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    private final int age;

    Rating (int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
