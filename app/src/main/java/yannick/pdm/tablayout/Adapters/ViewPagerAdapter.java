package yannick.pdm.tablayout.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import yannick.pdm.tablayout.fragments.ConfiguracoesFragment;
import yannick.pdm.tablayout.fragments.ListagemFragment;
import yannick.pdm.tablayout.fragments.RegistroFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new RegistroFragment();
            case 1:
                return new ListagemFragment();
            case 2:
                return new ConfiguracoesFragment();
            default:
                return new RegistroFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
