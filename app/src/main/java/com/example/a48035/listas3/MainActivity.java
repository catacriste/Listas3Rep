package com.example.a48035.listas3;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private List<Aluno> listaAlunos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popularListaAlunos();

        ListView listViewTurmas = (ListView) findViewById(R.id.listViewTurma);

        ListAdapter adaptador = new meuAdaptador(this, listaAlunos);

        listViewTurmas.setAdapter(adaptador);
    }

    private void popularListaAlunos() {
        listaAlunos.add(new Aluno("Bruno",1, R.drawable.bruno));
        listaAlunos.add(new Aluno("Catalin",2, R.drawable.cata));
        listaAlunos.add(new Aluno("David",3, R.drawable.david));
        listaAlunos.add(new Aluno("Ventura",4, R.drawable.ventura));
        listaAlunos.add(new Aluno("Jorge",5, R.drawable.jorge));
        listaAlunos.add(new Aluno("Rui",6, R.drawable.rui));
        listaAlunos.add(new Aluno("Ricardo",7, R.drawable.ricardo));
    }
}

class meuAdaptador extends ArrayAdapter<Aluno> {

    public meuAdaptador(Context context, List<Aluno> listAluno) {
        super(context, R.layout.view_item_turma, listAluno);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.view_item_turma, parent, false);
        }

        Aluno al = getItem(position);

        ImageView img = (ImageView) convertView.findViewById(R.id.imageButtonFoto);
        img.setImageResource(al.getNumeroImagem());

        TextView numeroAluno = (TextView) convertView.findViewById(R.id.textViewNumero);
        numeroAluno.setText("" + al.getNumeroAluno());

        TextView nomeAluno = (TextView) convertView.findViewById(R.id.textViewNome);
        nomeAluno.setText(al.getNomeAluno());

        return convertView;
    }
}
