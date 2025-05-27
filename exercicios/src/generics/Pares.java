package generics;

import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number, V> {

    private final SortedSet<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor){
        if(chave == null) return;

        Par<C, V> novoPar = new Par<>(chave, valor);

        if(itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave) {
        if(chave == null) return null;

        Optional<Par<C, V>> parOpcional = itens
                                            .stream()
                                            .filter(par -> chave.equals(par.getChave()))
                                            .findFirst();

        return parOpcional.isPresent()
                ? parOpcional.get().getValor() : null;
    }
}
