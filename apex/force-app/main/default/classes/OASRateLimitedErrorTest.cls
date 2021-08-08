@isTest
private class OASRateLimitedErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASRateLimitedError rateLimitedError1 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError2 = rateLimitedError1;
        OASRateLimitedError rateLimitedError3 = new OASRateLimitedError();
        OASRateLimitedError rateLimitedError4 = rateLimitedError3;

        System.assert(rateLimitedError1.equals(rateLimitedError2));
        System.assert(rateLimitedError2.equals(rateLimitedError1));
        System.assert(rateLimitedError1.equals(rateLimitedError1));
        System.assert(rateLimitedError3.equals(rateLimitedError4));
        System.assert(rateLimitedError4.equals(rateLimitedError3));
        System.assert(rateLimitedError3.equals(rateLimitedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRateLimitedError rateLimitedError1 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError2 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError3 = new OASRateLimitedError();
        OASRateLimitedError rateLimitedError4 = new OASRateLimitedError();

        System.assert(rateLimitedError1.equals(rateLimitedError2));
        System.assert(rateLimitedError2.equals(rateLimitedError1));
        System.assert(rateLimitedError3.equals(rateLimitedError4));
        System.assert(rateLimitedError4.equals(rateLimitedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRateLimitedError rateLimitedError1 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError2 = new OASRateLimitedError();

        System.assertEquals(false, rateLimitedError1.equals('foo'));
        System.assertEquals(false, rateLimitedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRateLimitedError rateLimitedError1 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError2 = new OASRateLimitedError();
        OASRateLimitedError rateLimitedError3;

        System.assertEquals(false, rateLimitedError1.equals(rateLimitedError3));
        System.assertEquals(false, rateLimitedError2.equals(rateLimitedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRateLimitedError rateLimitedError1 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError2 = new OASRateLimitedError();

        System.assertEquals(rateLimitedError1.hashCode(), rateLimitedError1.hashCode());
        System.assertEquals(rateLimitedError2.hashCode(), rateLimitedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRateLimitedError rateLimitedError1 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError2 = OASRateLimitedError.getExample();
        OASRateLimitedError rateLimitedError3 = new OASRateLimitedError();
        OASRateLimitedError rateLimitedError4 = new OASRateLimitedError();

        System.assert(rateLimitedError1.equals(rateLimitedError2));
        System.assert(rateLimitedError3.equals(rateLimitedError4));
        System.assertEquals(rateLimitedError1.hashCode(), rateLimitedError2.hashCode());
        System.assertEquals(rateLimitedError3.hashCode(), rateLimitedError4.hashCode());
    }
}
