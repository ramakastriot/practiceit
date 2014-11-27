public int compareTo(Point2D point) {
    Point2D origin = new Point2D(0, 0);
    double diff = this.distance(origin) - point.distance(origin);

    if(diff < 0)
        return -1;
    else if(diff > 0)
        return 1;

    return 0;
}
