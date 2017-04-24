package trafficLights;

import java.util.ArrayDeque;
import java.util.Iterator;


public class TrafficLight implements Iterable<Lights> {
    private ArrayDeque<Lights> lights;

    public TrafficLight() {
        this.lights = new ArrayDeque<>();
    }

    public void addLight(String light) {
        this.lights.offer(Lights.valueOf(light));
    }

    public void lightSignal() {
        Lights light = this.lights.poll();
        this.lights.offer(light);
    }

    @Override
    public String toString() {


        return "";
    }

    @Override
    public Iterator<Lights> iterator() {
        return new itterableQueue();
    }

    private final class itterableQueue implements Iterator<Lights> {
        private int index = lights.size();


        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public Lights next() {
            Lights light = lights.peekLast();
            Lights l = lights.pollLast();
            lights.push(l);
            index--;
            return light ;
        }
    }
}
