public int compareTo(CalendarDate date) {
    if(year < date.year)
        return -1;
    else if(year > date.year)
        return 1;
        
    if(month < date.month)
        return -1;
    else if(month > date.month)
        return 1;
        
    if(day < date.day)
        return -1;
    else if(day > date.day)
        return 1;
        
    return 0;
}
