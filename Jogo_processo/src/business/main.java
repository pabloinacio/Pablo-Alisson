package business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import Objects.Aquatico;
import Objects.NaoAquatico;

public class main extends JDialog {

	public static void main(String[] args) {
		UIManager.put("OptionPane.yesButtonText", "Yes");
		UIManager.put("OptionPane.noButtonText", "No");
		UIManager.put("OptionPane.cancelButtonText", "Cancel");
		List<Aquatico> aquaticoList = new ArrayList<Aquatico>();
		List<NaoAquatico> naquaticoList = new ArrayList<NaoAquatico>();
		int cancel = 0;
		aquaticoList.add(new Aquatico("tubarão", "null"));
		naquaticoList.add(new NaoAquatico("macaco", "null"));

		Collections.reverse(aquaticoList);
		Collections.reverse(naquaticoList);

		while (cancel == 0) {

			int resultado = JOptionPane.showConfirmDialog(null, "Pense em um animal.", "Jogo dos animais",
					JOptionPane.OK_CANCEL_OPTION);
			if (resultado != 0) {
				break;
			}
			int informe = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Informe",
					JOptionPane.YES_NO_OPTION);
			switch (informe) {
			case 0:
				for (Aquatico obj : aquaticoList) {
					String nome = null, diferenca = null;

					int escolha = JOptionPane.showConfirmDialog(null,
							"O animal que você pensou é um " + obj.getNome() + "?", "Informe",
							JOptionPane.YES_NO_OPTION);

					if (obj == aquaticoList.get(aquaticoList.size() - 1) && escolha != 0) {

						while (nome == null) {
							try {

								nome = JOptionPane.showInputDialog(null, "Qual animal você pensou?", "Input",
										JOptionPane.QUESTION_MESSAGE);
								nome.toLowerCase();

							} catch (NullPointerException e) {
								JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Message",
										JOptionPane.INFORMATION_MESSAGE);
								continue;
							}
							while (diferenca == null) {
								try {
									diferenca = JOptionPane.showInputDialog(null,
											"Um(a) " + nome + "_______ mas um(a) tubarão não.", "Input",
											JOptionPane.QUESTION_MESSAGE);
									diferenca.toLowerCase();

								} catch (NullPointerException e) {
									JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Message",
											JOptionPane.INFORMATION_MESSAGE);
									continue;
								}
							}
						}
						aquaticoList.add(0, new Aquatico(nome, diferenca));
						break;
					} else if (escolha == 0) {
						JOptionPane.showMessageDialog(null, "Eu venci!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
						break;
					} else {
						continue;
					}
				}
				break;
			default:
				for (NaoAquatico obj : naquaticoList) {
					String nome = null, diferenca = null;

					int escolha = JOptionPane.showConfirmDialog(null,
							"O animal que você pensou é um " + obj.getNome() + "?", "Informe",
							JOptionPane.YES_NO_OPTION);

					if (obj == naquaticoList.get(naquaticoList.size() - 1) && escolha != 0) {

						while (nome == null) {
							try {

								nome = JOptionPane.showInputDialog(null, "Qual animal você pensou?", "Input",
										JOptionPane.QUESTION_MESSAGE);
								nome.toLowerCase();

							} catch (NullPointerException e) {
								JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Message",
										JOptionPane.INFORMATION_MESSAGE);
								continue;
							}
							while (diferenca == null) {
								try {
									diferenca = JOptionPane.showInputDialog(null,
											"Um(a) " + nome + "_______ mas um(a) macaco não.", "Input",
											JOptionPane.QUESTION_MESSAGE);
									diferenca.toLowerCase();

								} catch (NullPointerException e) {
									JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Message",
											JOptionPane.INFORMATION_MESSAGE);
									continue;
								}
							}
						}
						naquaticoList.add(0, new NaoAquatico(nome, diferenca));
						break;
					} else if (escolha == 0) {
						JOptionPane.showMessageDialog(null, "Eu venci!!!", "Message", JOptionPane.INFORMATION_MESSAGE);
						break;
					} else {
						continue;
					}
				}
				break;
			}

		}
	}
}
