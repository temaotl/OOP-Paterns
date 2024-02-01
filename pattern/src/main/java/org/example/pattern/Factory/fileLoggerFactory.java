package org.example.pattern.Factory;

public class fileLoggerFactory implements  LoggerFactory{
    private  final String path;
     public fileLoggerFactory(String path)
    {
        this.path = path;
    }
    @Override
    public Logger createLogger() {
       return new FileLogger(path);
    }
}
