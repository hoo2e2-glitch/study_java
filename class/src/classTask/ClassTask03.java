package classTask;

import java.util.Scanner;

	// PlayerA
	// 10 170 16 24 35
	// 카드 뽑기

	class PlayerA {
	   int[] cards = {10, 170, 16, 24, 35};

	// PlayerB의 카드 중에 가장 큰 수와 가장 작은 수를 뽑아올 수 있는 메서드
	   public void takeCard(PlayerB playerB) {
	      int min = playerB.cards[0]; // 첫번째 카드를 최솟값으로 설정
	      int max = playerB.cards[0]; // 첫번째 카트를 최대값으로 설정
	      
	      for(int i = 0; i < playerB.cards.length; i++) {
	         if(min > playerB.cards[i]) {
	            min = playerB.cards[i]; // 더 작은거 나오면 교체
	         }
	         if(max < playerB.cards[i]) {
	            max = playerB.cards[i]; // 더 큰게 나오면 교체
	         }
	      }
	      
	      // min, max -> 내가 가진 카드에 추가하는 로직
	      addCard(min);
	      addCard(max);
	      
	      // B카드에서 삭제
	      removePlayerBCard(min, playerB);
	      removePlayerBCard(max, playerB);
	      
	   }
	   
	   // 카드를 추가하는 메서드
	   void addCard(int card) {
	      int[] newCards = new int[this.cards.length + 1]; // 기존보다 1칸 큰 배열 새로만든다
	      
	      for(int i = 0; i < this.cards.length; i++) {
	         newCards[i] = this.cards[i]; // 기존 카드 전부 복사
	      }
	      
	      newCards[this.cards.length] = card; // 맨 마지막 칸에 새 카드 추가
	      this.cards = newCards; // 새 배열로 교체
	   }
	   
	   // playerB 카드를 제거하는 메서드
	   void removePlayerBCard(int card, PlayerB playerB) {
	      int[] newCards = new int[playerB.cards.length - 1]; // 기존보다 1칸 작은 배열
	      int index = 0; // 새 배열에 넣을 위치
	      
	      for(int i = 0; i < playerB.cards.length; i++) {
	         if(playerB.cards[i] != card) { // 지울 카드가 아니면
	            newCards[index] = playerB.cards[i]; // 새 배열에 복사
	            index++;
	         }
	         // 지울카드면 그냥 건너뜀
	      }
	      
	      playerB.cards = newCards; // B카드를 새 배열로 교체
	   }
	   
	   
	   void showCards() {
	      String result = ""; // 빈문자열
	      for(int card: this.cards) { // 카드를 하나씩 꺼냄
	         result += String.valueOf(card) + " "; // 문자열로 이어붙임
	      }
	      System.out.println("A: " + result);
	   }
	   
	   
	}
	
	// PlayerB
	class PlayerB {
	   int[] cards = {53, 22, 74, 12, 13};
	   
	//   PlayerA의 카드 전부 중 모든 숫자의 홀수를 뽑아올 수 있는 메서드
	   public void takeCard(PlayerA playerA) {
	      for(int i = 0; i < playerA.cards.length; i++) {
	         if(playerA.cards[i] % 2 == 1) { // 나머지 1이면 홀수
	            int oddCard = playerA.cards[i];
	            
	            addCard(oddCard);	// 내카드에 추가
	            removePlayerACard(oddCard, playerA); // A카드에서 삭제
	         }
	      }
	   }
	   
		// 카드를 추가하는 메서드
		void addCard(int card) {
			int[] newCards = new int[this.cards.length + 1];
			
			for(int i = 0; i < this.cards.length; i++) {
				newCards[i] = this.cards[i];
			}
			
			newCards[this.cards.length] = card;
			this.cards = newCards;
		}
	   
		// playerA 카드를 제거하는 메서드
		void removePlayerACard(int card, PlayerA playerA) {
			int[] newCards = new int[playerA.cards.length - 1];
			int index = 0;
			
			for(int i = 0; i < playerA.cards.length; i++) {
				if(playerA.cards[i] != card) {
					newCards[index] = playerA.cards[i];
					index++;
				}
			}
			
			playerA.cards = newCards;
		}
		
		
		void showCards() {
			String result = "";
			for(int card: this.cards) {
				result += String.valueOf(card) + " ";
			}
			System.out.println("B: " + result);
		}
	}

	public class ClassTask03 {
		public static void main(String[] args) {

	      PlayerA a = new PlayerA(); // A객체
	      PlayerB b = new PlayerB(); // B객체
	      
	      a.takeCard(b); // A가 B카드에서 min(12), max(74) 가져옴
	      a.showCards(); // A카드 출력: 10 170 16 24 35 12 74
	      
	      b.takeCard(a); //  B가 A카드에서 홀수 가져옴 (35)
	      b.showCards(); // B카드 출력: 53 22 74 12 13 35
	      a.showCards(); // A카드 출력: 10 170 16 24 (35 사라짐)
	   }
	

	}

	
	
