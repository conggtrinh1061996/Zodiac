package com.dev.zodiacs.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zodiacs.R;
import com.dev.zodiacs.data.model.Zodiac;
import com.dev.zodiacs.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	ActivityMainBinding binding;
	public static final String ZODIAC_KEY = "zodiac_key";
	private Zodiac tempZodiac;
	List<Zodiac> zodiacs = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		// them du lieu cho cac cung hoang dao
		initializeZodiacs();
		// show or hide data
		showOrHideLayoutIntro(false);
		// set on Click listener
		setOnClickListenerImage();
	}

	private void initializeZodiacs() {
		if (zodiacs.isEmpty()) {
			zodiacs.add(new Zodiac(getString(R.string.bach_duong_title1), getString(R.string.bach_duong_title2), R.drawable.ic_bach_duong, getString(R.string.bach_duong_text)));
			zodiacs.add(new Zodiac(getString(R.string.kim_nguu_title1), getString(R.string.kim_nguu_title2), R.drawable.ic_kim_nguu, getString(R.string.kim_nguu_text)));
			zodiacs.add(new Zodiac(getString(R.string.song_tu_title1), getString(R.string.song_tu_title2), R.drawable.ic_song_tu, getString(R.string.song_tu_text)));
			zodiacs.add(new Zodiac(getString(R.string.cu_giai_title1), getString(R.string.cu_giai_title2), R.drawable.ic_cu_giai, getString(R.string.cu_giai_text)));
			zodiacs.add(new Zodiac(getString(R.string.su_tu_title1), getString(R.string.su_tu_title2), R.drawable.ic_su_tu, getString(R.string.su_tu_text)));
			zodiacs.add(new Zodiac(getString(R.string.xu_nu_title1), getString(R.string.xu_nu_title2), R.drawable.ic_xu_nu, getString(R.string.xu_nu_text)));
			zodiacs.add(new Zodiac(getString(R.string.thien_binh_title1), getString(R.string.thien_binh_title2), R.drawable.ic_thien_binh, getString(R.string.thien_binh_text)));
			zodiacs.add(new Zodiac(getString(R.string.bo_cap_title1), getString(R.string.bo_cap_title2), R.drawable.ic_bocap, getString(R.string.bo_cap_text)));
			zodiacs.add(new Zodiac(getString(R.string.nhan_ma_title1), getString(R.string.nhan_ma_title2), R.drawable.ic_nhan_ma, getString(R.string.nhan_ma_text)));
			zodiacs.add(new Zodiac(getString(R.string.ma_ket_title1), getString(R.string.ma_ket_title2), R.drawable.ic_ma_ket, getString(R.string.ma_ket_text)));
			zodiacs.add(new Zodiac(getString(R.string.bao_binh_title1), getString(R.string.bao_binh_title2), R.drawable.ic_bao_binh, getString(R.string.bao_binh_text)));
			zodiacs.add(new Zodiac(getString(R.string.song_ngu_title1), getString(R.string.song_ngu_title2), R.drawable.ic_song_ngu, getString(R.string.song_ngu_text)));
		}
	}

	private void setOnClickListenerImage() {
		binding.iconBachDuong.setOnClickListener(this);
		binding.iconKimNguu.setOnClickListener(this);
		binding.iconSongTu.setOnClickListener(this);
		binding.iconCuGiai.setOnClickListener(this);
		binding.iconSuTu.setOnClickListener(this);
		binding.iconXuNu.setOnClickListener(this);
		binding.iconThienBinh.setOnClickListener(this);
		binding.iconBoCap.setOnClickListener(this);
		binding.iconNhanMa.setOnClickListener(this);
		binding.iconMaKet.setOnClickListener(this);
		binding.iconBaoBinh.setOnClickListener(this);
		binding.iconSongNgu.setOnClickListener(this);
		binding.textMore.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if (view.getId() == binding.iconBachDuong.getId()) {
			showDataZodiac(0);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconKimNguu.getId()) {
			showDataZodiac(1);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconSongTu.getId()) {
			showDataZodiac(2);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconCuGiai.getId()) {
			showDataZodiac(3);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconSuTu.getId()) {
			showDataZodiac(4);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconXuNu.getId()) {
			showDataZodiac(5);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconThienBinh.getId()) {
			showDataZodiac(6);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconBoCap.getId()) {
			showDataZodiac(7);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconNhanMa.getId()) {
			showDataZodiac(8);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconMaKet.getId()) {
			showDataZodiac(9);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconBaoBinh.getId()) {
			showDataZodiac(10);
			showOrHideLayoutIntro(true);
		} else if (view.getId() == binding.iconSongNgu.getId()) {
			showDataZodiac(11);
			showOrHideLayoutIntro(true);
		} else {
			clickTextMore();
		}
	}

	private void showOrHideLayoutIntro(boolean isShow) {
		binding.layoutContent.setVisibility(isShow ? View.VISIBLE : View.INVISIBLE);
		binding.imageExplain.setVisibility(isShow ? View.VISIBLE : View.INVISIBLE);

	}

	private void showDataZodiac(int position) {
		Zodiac zodiac = zodiacs.get(position);
		binding.imageExplain.setImageResource(zodiac.getImageResource());
		binding.title2.setText(zodiac.getTitle2());
		binding.content.setText(zodiac.getContent());
		//
		addDataTempZodiac(zodiac);
	}

	private void clickTextMore() {
		Intent intent = new Intent(this, DetailActivity.class);
		intent.putExtra(ZODIAC_KEY, tempZodiac);
		startActivity(intent);
	}

	private void addDataTempZodiac(Zodiac zodiac) {
		tempZodiac = zodiac;
	}
}