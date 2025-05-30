package com.companyA;

import com.companyA.service.CheckableIdentity;
import org.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.companyA.doge.DogeTeam.*;

public class LayOffApp {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Set<BeanDefinition> candidateComponents = getAllCheckersImplementation();
        Map<String, Boolean> inputTest = new HashMap<>();
        initInputTest(inputTest);
        int sizeOfInput = inputTest.size();
        for(BeanDefinition beanDefinition : candidateComponents) {
            int count = 0;
            CheckableIdentity checker = initChecker(beanDefinition);
            for(String key : inputTest.keySet()) {
//                checker.check(key);
                Boolean result = inputTest.get(key);
                if(checker.isStartWithS(key).equals(result)) {
                    count++;
                }
            }
            System.out.println("developer with identity " + checker.getEmployeeId() + " has portion of correctness is " + count + "/" + sizeOfInput);
        }
    }

}