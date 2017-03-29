package javaschool.app;

import java.sql.Time;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Reminder extends Note {
    private Time time;


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    
    @Override
    public String toString() {
        return getId() + " " + getName() + " " + time;
    }
}
