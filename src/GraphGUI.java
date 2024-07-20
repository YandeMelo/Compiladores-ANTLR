import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

public class GraphGUI extends JFrame {

    private mxGraph graph;
    private Object parent;

    public GraphGUI(int height, int width) {
        setTitle("Grafo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);

        graph = new mxGraph();
        parent = graph.getDefaultParent();

        mxGraphComponent graphComponent = new mxGraphComponent(graph);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(graphComponent, BorderLayout.CENTER);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void addVertex(String vertexLabel, int x, int y, String tipo) {
        graph.getModel().beginUpdate();
        try {
        if (tipo == "conexao") {
            graph.insertVertex(parent, null, vertexLabel, x, y, 60, 25,
                    mxConstants.STYLE_SHAPE + "=" + mxConstants.SHAPE_RECTANGLE);
        } else if (rootPaneCheckingEnabled) {
            graph.insertVertex(parent, null, vertexLabel, x, y, 50, 50,
                    mxConstants.STYLE_SHAPE + "=" + mxConstants.SHAPE_CLOUD);
        }else {
            graph.insertVertex(parent, null, vertexLabel, x, y, 40, 40,
                    mxConstants.STYLE_SHAPE + "=" + mxConstants.SHAPE_ELLIPSE);
        }
        } finally {
            graph.getModel().endUpdate();
        }
    }

    public void addEdge(String edgeLabel, String sourceVertex, String targetVertex) {
        Object source = findVertex(sourceVertex);
        Object target = findVertex(targetVertex);

        if (source != null && target != null) {
            graph.getModel().beginUpdate();
            try {
                graph.insertEdge(parent, null, edgeLabel, source, target);
            } finally {
                graph.getModel().endUpdate();
            }
        } else {
            System.err.println("Erro ao adicionar aresta: Vértices não encontrados.");
        }
    }

    private Object findVertex(String vertexLabel) {
        Object[] vertices = graph.getChildVertices(parent);
        for (Object vertex : vertices) {
            if (graph.getLabel(vertex).equals(vertexLabel)) {
                return vertex;
            }
        }
        return null;
    }
}
