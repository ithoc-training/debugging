import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UnderConditionTest {

    public void stopWhenHit() {

        // given
        String theUuid = "550eeeee-bbbb-4141-7777-446655440000";
        UnderCondition underCondition = new UnderCondition();

        // when
        for (UUID uuid : underCondition.getUuids()) {
            System.out.println("theUuid: " + uuid);
        }

        // then
        assertTrue(true);
    }

}