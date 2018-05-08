package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry fields);

    public TimeEntry find(long id);

    public List<TimeEntry> list();

    public TimeEntry update(long id, TimeEntry updates);

    public TimeEntry delete(long id);
}
