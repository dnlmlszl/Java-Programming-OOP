package org.helsinki_uni.hashmaps.iou;

public class IOUMain {
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();

        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
