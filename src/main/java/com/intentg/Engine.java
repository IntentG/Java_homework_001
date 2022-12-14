package com.intentg;

public abstract class Engine implements Checkable {
    private Boolean getWork;

    public Engine() {
        this.getWork = false;
    }

    public void start () {
        this.getWork = true;
        System.out.println("Двигатель запущен...".toUpperCase());
        startInternal();
    }

    public void stop () {
        this.getWork = false;
        System.out.println("Двигатель остановлен...".toUpperCase());
        stopInternal();
    }

    public void accelerate(int level) {
        if (this.getWork) {
            System.out.printf("Дроссель открыт на %d%n", level);
            accelerateInternal(level);
        }
    }

    public Boolean getWork() {
        return getWork;
    }

    protected abstract void startInternal();
    protected abstract void stopInternal();
    protected abstract void accelerateInternal(int level);


}


