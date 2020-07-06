package com.example.atmconsult.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsult.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Element versao = new Element();
        versao.setTitle("Versao 1.0");
        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription("Integer ornare purus euismod pulvinar tempor. Mauris vel egestas orci.")

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br","Envie um email")

                .addGroup("Redes Sociais")
                .addFacebook("josesilva", "Facebook")
                .addInstagram("joseSilva", "Instagram")
                .addWebsite("www.google.com", "Google")

                .addItem(versao)

                .create();
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}
