/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

/**
 *
 * @author Desenvolvimento
 */
public class Mock {



   public static void makeMock(){
      createUsers();
      createProducts();
   }

   private static void createUsers(){
      ArrayList<Usuario> lista;

      if(Usuario.getLista().isEmpty()){
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome("Administrador");
         lista.add(admin);

         Usuario Joao = new Usuario();
         Joao.setEmail("joaovitor@hotmail.com");
         Joao.setSenha("joaovitor");
         Joao.setNome("João Vitor");
         lista.add(Joao);

      }
   }

   private static void createProducts(){
      ArrayList<Produto> lista;

      //só cria produtos com lista vazia
      if(Produto.getLista().isEmpty()){
         lista = Produto.getLista();

         Produto violino = new Produto();
         violino.setDescricao("Violino");
         violino.setPreco(7989.990f);
         violino.setOferta(true);
         violino.setImagem("https://www.dhresource.com/0x0s/f2-albu-g6-M01-21-55-rBVaR1uA56aATvmgAAXygNPtFpA578.jpg/violinos-instrumentos-de-corda-profissional.jpg");
         lista.add(violino);

         Produto arco_de_violino = new Produto();
         arco_de_violino.setDescricao("Arco de Violino");
         arco_de_violino.setPreco(249.99f);
         arco_de_violino.setOferta(false);
         lista.add(arco_de_violino);

         Produto estojo_de_violino = new Produto();
         estojo_de_violino.setDescricao("Estojo de Violino");
         estojo_de_violino.setPreco(149.99f);
         estojo_de_violino.setOferta(true);
         lista.add(estojo_de_violino);

         Produto breu = new Produto();
         breu.setDescricao("Breu");
         breu.setPreco(9.99f);
         breu.setOferta(false);
         lista.add(breu);

         Produto teclado = new Produto();
         teclado.setDescricao("Teclado");
         teclado.setPreco(998.99f);
         teclado.setOferta(true);
         lista.add(teclado);

         Produto piano = new Produto();
         piano.setDescricao("Piano");
         piano.setPreco(5998.99f);
         piano.setOferta(false);
         lista.add(piano);

      }

   }

}
