package com.akhil.models;



//public interface for the classifer
    //exposes its name and the recognize function
    //which given some drawn pixels as input
    //classifies what it sees as an MNIST image
public interface Classifier {
    String name();

    com.akhil.models.Classification recognize(final float[] pixels);
}
