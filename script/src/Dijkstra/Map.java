package Dijkstra;

import java.util.ArrayList;
import java.util.Random;

public class Map {

	public Map(int width, int height) {
		m_vertexs = new ArrayList<Map.VertexInfo>();		
		InitVertex(width, height);		
	}
	
	
	private void InitVertex(int width, int height) {		
		Random random = new Random();
		for(int i = 0;i < width;i++) {
			for(int j = 0;j < height;j++) {
				VertexInfo vertex = new VertexInfo(i, j, random.nextInt(10));
				m_vertexs.add(vertex);
			}
		}
	}
	
	private ArrayList<VertexInfo> m_vertexs;
	
	/*
	 * 定点信息
	 */
	class VertexInfo{
		
		public VertexInfo(int x, int y, int weight) {
			m_x = x;
			m_y = y;
			m_weight = weight;
		}
		
		/*
		 * 获取描述信息
		 */
		public String GetDes() {
			return "x:" + m_x +" y:" + m_y + " weight:" + m_weight;
		}
		
		//x坐标
		public int m_x;
		//y坐标
		public int m_y;
		//权重
		public int m_weight;		
	}	
}
