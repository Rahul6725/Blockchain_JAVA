package com.implement.blockchain;

import java.util.Arrays;

public class BlockChainExample {

    public static void main(String[] args) {

        Transaction transaction1 = new Transaction("Rahul", "Ghetia", 100L);
        Transaction transaction2 = new Transaction("Devang", "Dodiya", 1000L);
        Transaction transaction3 = new Transaction("Dhrumil", "Gohel", 1000L);
        Transaction transaction4 = new Transaction("Mihir", "Joshi", 150L);

        Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction3));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashCode());

    }
}
