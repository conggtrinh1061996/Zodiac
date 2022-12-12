package com.dev.zodiacs.ui.activity;

import static com.dev.zodiacs.ui.activity.MainActivity.ZODIAC_KEY;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dev.zodiacs.R;
import com.dev.zodiacs.data.model.Zodiac;
import com.dev.zodiacs.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

	ActivityDetailBinding binding;
	Zodiac zodiac;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
		getDataFromMain();
		setUp();
	}

	private void getDataFromMain() {
		zodiac = (Zodiac) getIntent().getSerializableExtra(ZODIAC_KEY);
	}

	private void setUp() {
		binding.title.setText(zodiac.getTitle1());
		binding.contentZodiac.setText(zodiac.getContent());
		binding.image.setImageResource(zodiac.getImageResource());
		// click back
		binding.textBack.setOnClickListener(view -> {
			finish();
		});
	}
}
