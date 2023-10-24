import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UnderCondition {

    private final List<UUID> uuids = new ArrayList<>(10000);


    /**
     * Constructor that fills the list with 10000 UUIDs apart from one that
     * is always the same.
     */
    public UnderCondition() {
        for(int i = 0; i < 9999; i++) {
            if(i == 213) {
                uuids.add(UUID.fromString("550eeeee-bbbb-4141-7777-446655440000"));
            } else {
                uuids.add(UUID.randomUUID());
            }
        }
    }


    public List<UUID> getUuids() {
        return uuids;
    }

}
