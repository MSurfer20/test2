@isTest
private class OASDraftTest {
    @isTest
    private static void equalsSameInstance() {
        OASDraft draft1 = OASDraft.getExample();
        OASDraft draft2 = draft1;
        OASDraft draft3 = new OASDraft();
        OASDraft draft4 = draft3;

        System.assert(draft1.equals(draft2));
        System.assert(draft2.equals(draft1));
        System.assert(draft1.equals(draft1));
        System.assert(draft3.equals(draft4));
        System.assert(draft4.equals(draft3));
        System.assert(draft3.equals(draft3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDraft draft1 = OASDraft.getExample();
        OASDraft draft2 = OASDraft.getExample();
        OASDraft draft3 = new OASDraft();
        OASDraft draft4 = new OASDraft();

        System.assert(draft1.equals(draft2));
        System.assert(draft2.equals(draft1));
        System.assert(draft3.equals(draft4));
        System.assert(draft4.equals(draft3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDraft draft1 = OASDraft.getExample();
        OASDraft draft2 = new OASDraft();

        System.assertEquals(false, draft1.equals('foo'));
        System.assertEquals(false, draft2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDraft draft1 = OASDraft.getExample();
        OASDraft draft2 = new OASDraft();
        OASDraft draft3;

        System.assertEquals(false, draft1.equals(draft3));
        System.assertEquals(false, draft2.equals(draft3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDraft draft1 = OASDraft.getExample();
        OASDraft draft2 = new OASDraft();

        System.assertEquals(draft1.hashCode(), draft1.hashCode());
        System.assertEquals(draft2.hashCode(), draft2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDraft draft1 = OASDraft.getExample();
        OASDraft draft2 = OASDraft.getExample();
        OASDraft draft3 = new OASDraft();
        OASDraft draft4 = new OASDraft();

        System.assert(draft1.equals(draft2));
        System.assert(draft3.equals(draft4));
        System.assertEquals(draft1.hashCode(), draft2.hashCode());
        System.assertEquals(draft3.hashCode(), draft4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDraft draft = new OASDraft();
        System.assertEquals(new List<Integer>(), draft.to);
        System.assertEquals(null, draft.id);
        System.assertEquals(null, draft.type);
        System.assertEquals(null, draft.topic);
        System.assertEquals(null, draft.content);
        System.assertEquals(null, draft.timestamp);
    }
}
