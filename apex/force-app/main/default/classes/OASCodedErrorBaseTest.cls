@isTest
private class OASCodedErrorBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCodedErrorBase codedErrorBase1 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase2 = codedErrorBase1;
        OASCodedErrorBase codedErrorBase3 = new OASCodedErrorBase();
        OASCodedErrorBase codedErrorBase4 = codedErrorBase3;

        System.assert(codedErrorBase1.equals(codedErrorBase2));
        System.assert(codedErrorBase2.equals(codedErrorBase1));
        System.assert(codedErrorBase1.equals(codedErrorBase1));
        System.assert(codedErrorBase3.equals(codedErrorBase4));
        System.assert(codedErrorBase4.equals(codedErrorBase3));
        System.assert(codedErrorBase3.equals(codedErrorBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCodedErrorBase codedErrorBase1 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase2 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase3 = new OASCodedErrorBase();
        OASCodedErrorBase codedErrorBase4 = new OASCodedErrorBase();

        System.assert(codedErrorBase1.equals(codedErrorBase2));
        System.assert(codedErrorBase2.equals(codedErrorBase1));
        System.assert(codedErrorBase3.equals(codedErrorBase4));
        System.assert(codedErrorBase4.equals(codedErrorBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCodedErrorBase codedErrorBase1 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase2 = new OASCodedErrorBase();

        System.assertEquals(false, codedErrorBase1.equals('foo'));
        System.assertEquals(false, codedErrorBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCodedErrorBase codedErrorBase1 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase2 = new OASCodedErrorBase();
        OASCodedErrorBase codedErrorBase3;

        System.assertEquals(false, codedErrorBase1.equals(codedErrorBase3));
        System.assertEquals(false, codedErrorBase2.equals(codedErrorBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCodedErrorBase codedErrorBase1 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase2 = new OASCodedErrorBase();

        System.assertEquals(codedErrorBase1.hashCode(), codedErrorBase1.hashCode());
        System.assertEquals(codedErrorBase2.hashCode(), codedErrorBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCodedErrorBase codedErrorBase1 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase2 = OASCodedErrorBase.getExample();
        OASCodedErrorBase codedErrorBase3 = new OASCodedErrorBase();
        OASCodedErrorBase codedErrorBase4 = new OASCodedErrorBase();

        System.assert(codedErrorBase1.equals(codedErrorBase2));
        System.assert(codedErrorBase3.equals(codedErrorBase4));
        System.assertEquals(codedErrorBase1.hashCode(), codedErrorBase2.hashCode());
        System.assertEquals(codedErrorBase3.hashCode(), codedErrorBase4.hashCode());
    }
}
