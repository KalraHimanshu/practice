package kalra.himanshu.demo.verify.collection;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class PQNode
        implements Comparable
{
    String value;
    int sequence;

    @Override
    public int compareTo(Object o) {
        return Integer.compare(sequence, ((PQNode) o).sequence);
    }
}
