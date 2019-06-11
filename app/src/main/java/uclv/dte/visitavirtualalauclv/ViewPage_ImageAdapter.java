package uclv.dte.visitavirtualalauclv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

/**
 * Created by SERGIO-PC on 22/02/2019.
 */

public class ViewPage_ImageAdapter extends PagerAdapter{
    private Context context;

    public String[] images= {
            "slider/img/valla.jpg",
            "slider/img/marta.jpg",
            "slider/img/rectorado.jpg",
            "slider/img/policlinico.jpg",
            "slider/img/relaciones internacionales.jpg",
            "slider/img/Sala 35 aniversario.jpg",
            "slider/img/Recursos humanos.jpg",

            "slider/img/salahistoria/saladehistoria1.jpg",
            "slider/img/salahistoria/saladehistoria2.jpg",
            "slider/img/salahistoria/saladehistoria3.jpg",

            "slider/img/agropecuaria/ceed.jpg",
            "slider/img/agropecuaria/comedorcamilito.jpg",
            "slider/img/agropecuaria/hotelito.jpg",
            "slider/img/agropecuaria/IBP.jpg",
            "slider/img/agropecuaria/Residencia Estudiantil Camilito.jpg",

            "slider/img/areasdeportivas/SEDER.jpg",
            "slider/img/areasdeportivas/SEDER piscina.jpg",
            "slider/img/areasdeportivas/areasdeportivas.jpg",
            "slider/img/areasdeportivas/criollos1.jpg",
            "slider/img/areasdeportivas/criollos2.jpg",
            "slider/img/areasdeportivas/criollos3.jpg",
            "slider/img/areasdeportivas/criollos4.jpg",
            "slider/img/construccion/panaderia.jpg",

            "slider/img/cbq/CBQ.jpg",
            "slider/img/cbq/CBQ planta de produccion.jpg",

            "slider/img/cei/CEI.jpg",
            "slider/img/cei/CEI-int.jpg",

            "slider/img/construccion/Construcciones.jpg",
            "slider/img/construccion/Construcciones1.jpg",
            "slider/img/construccion/Construcciones2.jpg",

            "slider/img/coronado/coronado1.jpg",
            "slider/img/coronado/coronado2.jpg",
            "slider/img/coronado/coronado4.jpg",
            "slider/img/coronado/coronado5.jpg",

            "slider/img/economia/Ciencias Economicas.jpg",
            "slider/img/economia/Ciencias Economicas1.jpg",
            "slider/img/economia/Ciencias Economicas2.jpg",

            "slider/img/Electrica.jpg",
            "slider/img/electrica/elect1.jpg",
            "slider/img/electrica/elect2.jpg",
            "slider/img/electrica/elect3.jpg",
            "slider/img/electrica/FIE Grupo automatizacion, robotica y persepcion.jpg",
            "slider/img/electrica/FIE Laboratorio de electronica analogica.jpg",

            "slider/img/feu/Casa del Estudiante.jpg",
            "slider/img/feu/Casa estudiante 1.jpg",
            "slider/img/feu/Casa estudiante 2.jpg",
            "slider/img/feu/feu2.jpg",
            "slider/img/feu/feu3.jpg",
            "slider/img/feu/feu4.jpg",

            "slider/img/humanidades/Ciencias Sociales.jpg",
            "slider/img/humanidades/CentroEstudiosComunitarios.jpg",
            "slider/img/humanidades/hum1.jpg",
            "slider/img/humanidades/hum2.jpg",
            "slider/img/humanidades/hum4.jpg",
            "slider/img/humanidades/Humanidades.jpg",
            "slider/img/humanidades/soc1.jpg",
            "slider/img/humanidades/soc2.jpg",
            "slider/img/humanidades/soc3.jpg",

            "slider/img/jardin/cejb1.jpg",
            "slider/img/jardin/cejb2.jpg",
            "slider/img/jardin/cejb3.jpg",
            "slider/img/jardin/cejb4.jpg",

            "slider/img/farmacia/Quimica-Farmacia.jpg",
            "slider/img/farmacia/Quimica farmacia laboratorio.jpg",

            "slider/img/mecanica/Mecanica e Industrial.jpg",
            "slider/img/mecanica/mecaninca1.jpg",
            "slider/img/mecanica/Mecanica CISoldadura.jpg",
            "slider/img/mecanica/Mecanica Lab hidraulica.jpg",
            "slider/img/mecanica/Mecanica metrologia.jpg",
            "slider/img/mecanica/Mecanica Talleres.jpg",
            "slider/img/mecanica/taller de fundicion.jpg",
            "slider/img/mecanica/taller de motor2.jpg",


            "slider/img/mfc/Mat Fis y Comp.jpg",
            "slider/img/mfc/MFC ACM.jpg",
            "slider/img/mfc/MFC ACM1.jpg",
            "slider/img/mfc/MFC Lab computacion.jpg",
            "slider/img/mfc/MFC lab electromagnetismo.jpg",
            "slider/img/mfc/MFC lab electromagnetismo1.jpg",

            "slider/img/teatro/teatro1.jpg",
            "slider/img/teatro/teatro2.jpg",
            "slider/img/teatro/teatro3.jpg",
            "slider/img/teatro/teatro4.jpg",
            "slider/img/teatro/teatro5.jpg",

            "slider/img/Becas900.jpg"
           // "slider/img/tarjah.jpg"

        };
    public String[] titles;

    public ViewPage_ImageAdapter(Context c){
        context = c;
        String[] newtitles= {
                context.getString(R.string.img_1),
                context.getString(R.string.img_2),
                context.getString(R.string.img_3),
                context.getString(R.string.img_4),
                context.getString(R.string.img_5),
                context.getString(R.string.img_6),
                context.getString(R.string.img_7),
                context.getString(R.string.img_8),
                context.getString(R.string.img_9),
                context.getString(R.string.img_10),
                context.getString(R.string.img_11),
                context.getString(R.string.img_12),
                context.getString(R.string.img_13),
                context.getString(R.string.img_14),
                context.getString(R.string.img_15),
                context.getString(R.string.img_16),
                context.getString(R.string.img_17),
                context.getString(R.string.img_18),
                context.getString(R.string.img_19),
                context.getString(R.string.img_20),
                context.getString(R.string.img_21),
                context.getString(R.string.img_22),
                context.getString(R.string.img_23),
                context.getString(R.string.img_24),
                context.getString(R.string.img_25),
                context.getString(R.string.img_26),
                context.getString(R.string.img_27),
                context.getString(R.string.img_28),
                context.getString(R.string.img_29),
                context.getString(R.string.img_30),
                context.getString(R.string.img_31),
                context.getString(R.string.img_32),
                context.getString(R.string.img_33),
                context.getString(R.string.img_34),
                context.getString(R.string.img_35),
                context.getString(R.string.img_36),
                context.getString(R.string.img_37),
                context.getString(R.string.img_38),
                context.getString(R.string.img_39),
                context.getString(R.string.img_40),
                context.getString(R.string.img_41),
                context.getString(R.string.img_42),
                context.getString(R.string.img_43),
                context.getString(R.string.img_44),
                context.getString(R.string.img_45),
                context.getString(R.string.img_46),
                context.getString(R.string.img_47),
                context.getString(R.string.img_48),
                context.getString(R.string.img_49),
                context.getString(R.string.img_50),
                context.getString(R.string.img_51),
                context.getString(R.string.img_52),
                context.getString(R.string.img_53),
                context.getString(R.string.img_54),
                context.getString(R.string.img_55),
                context.getString(R.string.img_56),
                context.getString(R.string.img_57),
                context.getString(R.string.img_58),
                context.getString(R.string.img_59),
                context.getString(R.string.img_60),
                context.getString(R.string.img_61),
                context.getString(R.string.img_62),
                context.getString(R.string.img_63),
                context.getString(R.string.img_64),
                context.getString(R.string.img_65),
                context.getString(R.string.img_66),
                context.getString(R.string.img_67),
                context.getString(R.string.img_68),
                context.getString(R.string.img_69),
                context.getString(R.string.img_70),
                context.getString(R.string.img_71),
                context.getString(R.string.img_72),
                context.getString(R.string.img_73),
                context.getString(R.string.img_74),
                context.getString(R.string.img_75),
                context.getString(R.string.img_76),
                context.getString(R.string.img_77),
                context.getString(R.string.img_78),
                context.getString(R.string.img_79),
                context.getString(R.string.img_80),
                context.getString(R.string.img_81),
                context.getString(R.string.img_82),
                context.getString(R.string.img_83),
                context.getString(R.string.img_84)

        };

        titles = newtitles;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item = inflater.inflate(R.layout.activity_zoom, container, false);

        //---Accedo al campo title
        TextView lbltitle = (TextView) item.findViewById(R.id.idtitle);
        lbltitle.setText(titles[position]);

        //---Accedo al campo imagen
        TouchImageView imgview = (TouchImageView)item.findViewById(R.id.idzoomimg);
        //TouchImageView imgview = new TouchImageView(context);
        imgview.setImageResource(R.drawable.marta);
        InputStream in;
        try {
            String imagen = images[position]; //obtencion del nombre de la imagen
            //imagen = imagen.toLowerCase();
            in = context.getAssets().open(imagen); //obtencion de fichero input de la imagen a partir de su nombre
            Bitmap bitmap = BitmapFactory.decodeStream(in);
            imgview.setImageBitmap(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        container.addView(item);
        return item;
    }

     @Override
     public void destroyItem(ViewGroup container, int position, Object object){
         ((ViewPager)container).removeView((View)object);
     }

}
