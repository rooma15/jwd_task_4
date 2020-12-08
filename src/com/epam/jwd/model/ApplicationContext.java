package com.epam.jwd.model;

import com.epam.jwd.Strorage.impl.FigurePostProcessorStorage;
import com.epam.jwd.Strorage.impl.FigurePreProcessorStorage;
import com.epam.jwd.factory.FigureFactory;

public interface ApplicationContext {
    FigureFactory createFigureFactory();
    void setPreProcessorStorage(FigurePreProcessorStorage storage);
    void setPostProcessorStorage(FigurePostProcessorStorage storage);
}
