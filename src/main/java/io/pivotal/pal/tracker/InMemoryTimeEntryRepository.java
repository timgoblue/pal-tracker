package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    Map<Long, TimeEntry> timeEntryMap = new HashMap<>();
    private long counter = 0;

    public TimeEntry create(TimeEntry timeEntry) {
        timeEntry.setId(++counter);
        timeEntryMap.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return timeEntryMap.get(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntryMap.values());
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntry.setId(id);
        timeEntryMap.put(id, timeEntry);

        return timeEntryMap.get(id);
    }

    public TimeEntry delete(long id) {
        return timeEntryMap.remove(id);
    }
}
