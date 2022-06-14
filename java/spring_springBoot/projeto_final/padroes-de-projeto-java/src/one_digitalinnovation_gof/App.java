package one_digitalinnovation_gof;

import one_digitalinnovation_gof.facade.Facade;
import one_digitalinnovation_gof.singleton.SingletonEager;
import one_digitalinnovation_gof.singleton.SingletonLazy;
import one_digitalinnovation_gof.singleton.SingletonLazyHolder;
import one_digitalinnovation_gof.strategy.Comportamento;
import one_digitalinnovation_gof.strategy.ComportamentoAgressivo;
import one_digitalinnovation_gof.strategy.ComportamentoDefensivo;
import one_digitalinnovation_gof.strategy.ComportamentoNormal;
import one_digitalinnovation_gof.strategy.Robo;

public class App {
    public static void main(String[] args) {

        // Singleton

        // SingletonLazy lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);
        // lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);

        // SingletonEager eager = SingletonEager.getInstancia();
        // System.out.println(eager);
        // eager = SingletonEager.getInstancia();
        // System.out.println(eager);

        // SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        // System.out.println(lazyHolder);
        // lazyHolder = SingletonLazyHolder.getInstancia();
        // System.out.println(lazyHolder);

        // SingletonLazy lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);
        // lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);

        // Strategy

        // Comportamento defensivo = new ComportamentoDefensivo();
        // Comportamento normal = new ComportamentoNormal();
        // Comportamento agressivo = new ComportamentoAgressivo();

        // Robo robo = new Robo();
        // robo.setComportamento(normal);
        // robo.mover();
        // robo.mover();
        // robo.setComportamento(agressivo);
        // robo.mover();
        // robo.mover();
        // robo.mover();
        // robo.setComportamento(defensivo);
        // robo.mover();

        // Facade

        // Facade facade = new Facade();
        // facade.migrarCliente("Lucca", "134029000");
    }
}
