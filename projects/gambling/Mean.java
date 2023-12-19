class Mean{
    public double mean(double[] interval) {
        double highest = interval[1];
        double lowest = interval[0];
        return (highest + lowest) / 2.0;
    }
}