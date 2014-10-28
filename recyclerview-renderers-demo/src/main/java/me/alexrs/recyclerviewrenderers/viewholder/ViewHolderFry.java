package me.alexrs.recyclerviewrenderers.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.items.ItemFry;

/**
 * @author Alejandro on 27/10/14.
 */
public class ViewHolderFry extends RenderViewHolder<ItemFry> {

    @InjectView(R.id.button)
    Button button;

    public ViewHolderFry(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
    }

    @OnClick(R.id.button)
    public void performClick(View view) {
        Toast.makeText(view.getContext(), "BUTTON", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBindView(ItemFry renderable) {
    }
}