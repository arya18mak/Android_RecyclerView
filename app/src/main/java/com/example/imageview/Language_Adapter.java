package com.example.imageview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Language_Adapter extends RecyclerView.Adapter<Language_Adapter.LanguageViewHolder> implements View.OnClickListener {
    String[] mLanguages;
    public Language_Adapter(String[] mLanguages){
    this.mLanguages= mLanguages;
    }
    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View LanguageView = inflater.inflate(R.layout.language_item, parent, false);
        LanguageViewHolder viewHolder = new LanguageViewHolder(LanguageView);

        LanguageView.setOnClickListener(this);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, int position) {
            String currentlanguage = mLanguages[position];
            holder.txtLanguage.setText(currentlanguage);
    }

    @Override
    public int getItemCount() {
        return mLanguages.length;
    }

    @Override
    public void onClick(View v) {
        TextView txtLanguage = v.findViewById(R.id.txt_language);
        Context context = v.getContext();
        String currentLanguage = txtLanguage.getText().toString();
        Toast.makeText(context,currentLanguage, Toast.LENGTH_SHORT).show();
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder {
        TextView txtLanguage;
        public LanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            txtLanguage = itemView.findViewById(R.id.txt_language);

        }
    }
}
