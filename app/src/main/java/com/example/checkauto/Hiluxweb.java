package com.example.checkauto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Hiluxweb extends DetallesAuto {
 WebView WebView;
 TextView modelo1;
 String modelo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiluxweb);

        WebView view = (WebView) findViewById(R.id.WebView);
        modelo1 = (TextView) findViewById(R.id.tbModeloDescripcion);
        Bundle bundle = this.getIntent().getExtras();
        modelo2 = bundle.getString("modelo");

        view.getSettings().setJavaScriptEnabled(true);// permite que algunas paginas funcionen bien
        view.getSettings().setBuiltInZoomControls(true);//perimite zoom si la pagina no es responsive
        if (modelo2.equals("Hilux")) { view.loadUrl("https://autoblog.com.ar/2019/07/17/lanzamiento-toyota-hilux-2020/");}
        else if (modelo2.equals("Ka")){view.loadUrl("https://www.diariomotor.com/coche/ford-ka/");}
        else if (modelo2.equals("Onix")){view.loadUrl("https://autoblog.com.ar/2019/11/28/lanzamiento-chevrolet-onix-y-onix-plus/");}
        else if (modelo2.equals("Etios")){view.loadUrl("https://autoblog.com.ar/2018/03/27/lanzamiento-toyota-etios-2018/");}
        else if (modelo2.equals("Gol")){view.loadUrl("https://www.volkswagen.com.ar/es/modelos/gol.html?utm_source=google&utm_medium=ppc&utm_campaign=alo_gol&utm_term=b_inst_au_aff_vehicles&utm_content=rsa_ad1_kw_gol_trend&tc=sem-ALO-ar-google_adw-b_gol-b_inst_au_aff_vehicles-exact-rsa_ad1-&kw=gol_trend&adchan=sem&campaign=%5BB%5D_%5BGol%5D_%5BAll%5D_%5BHatchback%5D_%5BAMT%5D_%5BES%5D_%5BEval%5D_au_affinity&adgroup=Inst_%5Bexact%5D_gol_vehicles_trend&publisher=GOOGLE&adcr=gol+trend&adpl=GOOGLE&adlid=71700000057329363&country=AR&language=ES&gclid=CjwKCAjwk6P2BRAIEiwAfVJ0rBTLLqt13Ezuj8MX01wx4g-lCFKcMdmI7Oe7M8r0ld3C-GCjAl814hoCnycQAvD_BwE&gclsrc=aw.ds");}
        else if (modelo2.equals("Amaroksd")){view.loadUrl("https://www.volkswagen.com.ar/es/modelos/nueva-amarok.html/");}
        else if (modelo2.equals("Ranger")){view.loadUrl("https://www.actualidadmotor.com/modelos/ford-ranger-ficha/");}
        else if (modelo2.equals("Kwid")){view.loadUrl("https://www.renault.com.ar/automoviles/kwid.html");}
        else if (modelo2.equals("Sandero")){view.loadUrl("https://www.renault.com.ar/automoviles/sandero.html");}
        else {
            view.loadUrl("https://www.peugeot.com.ar/gama/descubri-nuestros-vehiculos/peugeot-208.html");
        }
        // metodo que permite navegar dentro del navegador
        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView view, String url){
                return false;//permite que la pagina se refresque en el webview
            }
                              });
    }
}
