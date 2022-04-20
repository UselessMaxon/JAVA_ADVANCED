import Calc_OOP.WhatOperation;
import Calc_OOP.Calc_OOP_MAIN_4;
import Calc_OOP.operationsNew.OperationsNew;
import com.sun.deploy.util.StringUtils;
import Calc_OOP.*;
import org.junit.Assert;
import org.junit.Test;

public class MyTests {

    @Test
    public void operationSum() {
        OperationsNew sum = new OperationsNew(55.5555, 33.3211);
        Assert.assertEquals(55.5555 + 33.3211, sum.goAnswerSum(sum.getFirstNumber(), sum.getSecondNumber()), 0);
    }

    @Test
    public void operationSumInputNegativeNumber() {
        OperationsNew sum = new OperationsNew(-55.5555, -33.3211);
        Assert.assertEquals(-55.5555 + -33.3211, sum.goAnswerSum(sum.getFirstNumber(), sum.getSecondNumber()), 0);
    }

    @Test
    public void operationSub() {
        OperationsNew sub = new OperationsNew(55.5555, 33.3211);
        Assert.assertEquals(55.5555 - 33.3211, sub.goAnswerSub(sub.getFirstNumber(), sub.getSecondNumber()), 0);
    }

    @Test
    public void negativeAnswerSub() {
        OperationsNew sub = new OperationsNew(55.5555, 66.3211);
        Assert.assertEquals(55.5555 - 66.3211, sub.goAnswerSub(sub.getFirstNumber(), sub.getSecondNumber()), 0);
    }

    @Test
    public void operationMulti() {
        OperationsNew multi = new OperationsNew(55.5555, 33.3211);
        Assert.assertEquals(55.5555 * 33.3211, multi.goAnswerMul(multi.getFirstNumber(), multi.getSecondNumber()), 0);
    }

    @Test
    public void operationMultiOnZero() {
        OperationsNew multi = new OperationsNew(55.5555, 0);
        Assert.assertEquals(0, multi.goAnswerMul(multi.getFirstNumber(), multi.getSecondNumber()), 0);
    }

    @Test
    public void operationDiv() {
        OperationsNew div = new OperationsNew(55.5555, 33.3211);
        Assert.assertEquals(55.5555 / 33.3211, div.goAnswerDiv(div.getFirstNumber(), div.getSecondNumber()), 0);
    }

    @Test
    public void operationDivOnZero() {
        OperationsNew div = new OperationsNew(55.5555, 0);
        Assert.assertEquals(55.5555 / 0, div.goAnswerDiv(div.getFirstNumber(), div.getSecondNumber()), 0);
    }

    @Test
    public void chekGetFirstNumber() {
        OperationsNew first = new OperationsNew(78.9581, 3414.4868);
        Assert.assertEquals(78.9581, first.getFirstNumber(), 0);
    }

    @Test
    public void chekGetSecondNumber() {
        OperationsNew second = new OperationsNew(78.9581, 3414.4868);
        Assert.assertEquals(3414.4868, second.getSecondNumber(), 0);
    }

    @Test
    public void whatOperationSum() {
        WhatOperation ready = new WhatOperation();
        Assert.assertEquals(43.9999+56.4444, ready.whatOperation('+', 43.9999,56.4444), 0);
    }

    @Test
    public void whatOperationSub() {
        WhatOperation ready = new WhatOperation();
        Assert.assertEquals(43.9999-56.4444, ready.whatOperation('-', 43.9999,56.4444), 0);
    }

    @Test
    public void whatOperationMulti() {
        WhatOperation ready = new WhatOperation();
        Assert.assertEquals(43.9999*56.4444, ready.whatOperation('*', 43.9999,56.4444), 0);
    }

    @Test
    public void whatOperationDiv() {
        WhatOperation ready = new WhatOperation();
        Assert.assertEquals(43.9999/56.4444, ready.whatOperation('/', 43.9999,56.4444), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExceptionWhatOperation() {
        WhatOperation ready = new WhatOperation();
        ready.whatOperation('%', 43.9999,56.4444);
    }

}
