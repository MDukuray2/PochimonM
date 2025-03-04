package src;
public interface ICatchable {
    boolean tryToCatch(Trainer trainer);

    double getCaptureRate(Trainer trainer);
}
