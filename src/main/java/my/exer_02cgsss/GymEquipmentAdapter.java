package my.exer_02cgsss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GymEquipmentAdapter extends RecyclerView.Adapter<GymEquipmentAdapter.ViewHolder> {

    private Context context;
    private List<GymEquipment> equipmentList;

    public GymEquipmentAdapter(Context context, List<GymEquipment> equipmentList) {
        this.context = context;
        this.equipmentList = equipmentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gym_equipment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GymEquipment equipment = equipmentList.get(position);

        holder.ivEquipmentImage.setImageResource(equipment.getImageResId());
        holder.textViewEquipmentName.setText(equipment.getName());
        holder.textViewStatus.setText(equipment.getStatus());

        holder.buttonReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 예약 버튼 클릭 시 동작
                if (equipment.getStatus().equals("사용할 수 있음")) {
                    // 예약 가능한 기구일 경우 동작
                    equipment.setStatus("사용중");
                    notifyDataSetChanged();
                    Toast.makeText(context, "기구 이용이 시작되었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    // 예약 불가능한 기구일 경우 동작
                    Toast.makeText(context, "사용중인 기구입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        holder.buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 예약 취소 버튼 클릭 시 동작
                if (equipment.getStatus().equals("사용중")) {
                    // 예약된 기구일 경우 동작
                    equipment.cancelReservation();
                    notifyDataSetChanged();
                    Toast.makeText(context, "기구 이용이 종료되었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    // 예약되지 않은 기구일 경우 동작
                    Toast.makeText(context, "사용중인 기구가 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return equipmentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivEquipmentImage;
        public TextView textViewEquipmentName;
        public TextView textViewStatus;
        public Button buttonReserve;
        public Button buttonCancel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivEquipmentImage = itemView.findViewById(R.id.ivEquipmentImage);
            textViewEquipmentName = itemView.findViewById(R.id.textViewEquipmentName);
            textViewStatus = itemView.findViewById(R.id.textViewStatus);
            buttonReserve = itemView.findViewById(R.id.buttonReserve);
            buttonCancel = itemView.findViewById(R.id.buttonCancel);
        }
    }
}
