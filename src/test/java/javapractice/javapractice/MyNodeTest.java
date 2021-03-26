package javapractice.javapractice;

import javapractice.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    private Assertions Assert;

    @Test
    void GivenThreeNumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer>myFristNode= new MyNode<>(56);
        MyNode<Integer>mySecondNode= new MyNode<>(30);
        MyNode<Integer>myThirdNode= new MyNode<>(56);
        myFristNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFristNode.getNext().equals(mySecondNode) &&
                          myFristNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result); 
    }
}
