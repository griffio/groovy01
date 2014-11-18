import spock.lang.Specification

class SpockTest extends Specification {
    def "length of list removing integers other than 5"() {

        def list = [5, 6, 7, 8, 9];

        list.removeAll {
            it.intValue() != 5
        }

        expect:
        list.size() == 1

    }
}
