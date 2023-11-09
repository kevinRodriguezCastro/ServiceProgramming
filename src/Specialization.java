public enum Specialization {
    NetWorking(35),Programming(50),Sysadmin(40);
    int duration;

    Specialization(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
