package com.example.mad_n2_t16.slide;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.mad_n2_t16.R;
import com.example.mad_n2_t16.cauhoi.Cauhoi;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScreenSlidePageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScreenSlidePageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ArrayList<Cauhoi> arrayListCauhoi;
    public static final String arg_page = "page";
    public static final String arg_checkAnswer = "checkAnswer";
    public int mPageNum; //Vị trí trang hiện tại
    public int checkAns; //Biến kiểm tra

    TextView tvNum, tvQuestion;
    RadioGroup radioGroup;
    RadioButton radA, radB, radC, radD;

    public ScreenSlidePageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScreenSlidePageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScreenSlidePageFragment newInstance(String param1, String param2) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        arrayListCauhoi = new ArrayList<Cauhoi>();
        ScreenSlideActivity screenSlideActivity = (ScreenSlideActivity) getActivity();
        arrayListCauhoi = screenSlideActivity.getData();
        mPageNum = getArguments().getInt(arg_page);
        checkAns = getArguments().getInt(arg_checkAnswer);
    }

    public static ScreenSlidePageFragment create(int pageNum, int checkAnswer) {
        ScreenSlidePageFragment screenSlidePageFragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(arg_page, pageNum);
        args.putInt(arg_checkAnswer, checkAnswer);
        screenSlidePageFragment.setArguments(args);
        return screenSlidePageFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        tvNum = (TextView) rootView.findViewById(R.id.tvNum);
        tvQuestion = (TextView) rootView.findViewById(R.id.tvQuestion);
        radA = (RadioButton) rootView.findViewById(R.id.radA);
        radB = (RadioButton) rootView.findViewById(R.id.radB);
        radC = (RadioButton) rootView.findViewById(R.id.radC);
        radD = (RadioButton) rootView.findViewById(R.id.radD);
        radioGroup = (RadioGroup) rootView.findViewById(R.id.radGroup);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvNum.setText("Câu " + (mPageNum + 1));
        tvQuestion.setText(arrayListCauhoi.get(mPageNum).getQuestion());
        radA.setText(arrayListCauhoi.get(mPageNum).getAns_a());
        radB.setText(arrayListCauhoi.get(mPageNum).getAns_b());
        radC.setText(arrayListCauhoi.get(mPageNum).getAns_c());
        radD.setText(arrayListCauhoi.get(mPageNum).getAns_d());

        if(checkAns != 0){
            radA.setClickable(false);
            radB.setClickable(false);
            radC.setClickable(false);
            radD.setClickable(false);
            getCheckAns(arrayListCauhoi.get(mPageNum).getResult().toString());
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                arrayListCauhoi.get(mPageNum).choiceID = i;
                arrayListCauhoi.get(mPageNum).setAnswer(getChoiceFromID(i));
                //Toast.makeText(getActivity(),"Đây là đáp án" + i,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getChoiceFromID(int id) {
        if (id == R.id.radA)
            return "A";
        else if (id == R.id.radB)
            return "B";
        else if (id == R.id.radC)
            return "C";
        else if (id == R.id.radD)
            return "D";
        else return "";
    }

    private void getCheckAns(String ans){
        if(ans.equals("A") == true){
            if (arrayListCauhoi.get(mPageNum).getResult().toString().equals(arrayListCauhoi.get(mPageNum).getAnswer().toString()) == false)
                radA.setBackgroundColor(Color.RED);
            else radA.setBackgroundColor(Color.GREEN);
        }
        else if(ans.equals("B") == true){
            if (arrayListCauhoi.get(mPageNum).getResult().toString().equals(arrayListCauhoi.get(mPageNum).getAnswer().toString()) == false)
                radB.setBackgroundColor(Color.RED);
            else radB.setBackgroundColor(Color.GREEN);
        }
        else if(ans.equals("C") == true){
            if (arrayListCauhoi.get(mPageNum).getResult().toString().equals(arrayListCauhoi.get(mPageNum).getAnswer().toString()) == false)
                radC.setBackgroundColor(Color.RED);
            else radC.setBackgroundColor(Color.GREEN);
        }
        else if(ans.equals("D") == true){
            if (arrayListCauhoi.get(mPageNum).getResult().toString().equals(arrayListCauhoi.get(mPageNum).getAnswer().toString()) == false)
                radD.setBackgroundColor(Color.RED);
            else radD.setBackgroundColor(Color.GREEN);
        }
        else ;
    }
}