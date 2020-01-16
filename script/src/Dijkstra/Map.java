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
	 * ������Ϣ
	 */
	class VertexInfo{
		
		public VertexInfo(int x, int y, int weight) {
			m_x = x;
			m_y = y;
			m_weight = weight;
		}
		
		/*
		 * ��ȡ������Ϣ
		 */
		public String GetDes() {
			return "x:" + m_x +" y:" + m_y + " weight:" + m_weight;
		}
		
		//x����
		public int m_x;
		//y����
		public int m_y;
		//Ȩ��
		public int m_weight;		
	}	
}
