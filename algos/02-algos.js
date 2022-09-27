class ListNode {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
  }
  
  class SinglyLinkedList {
  
    constructor() {
      this.head = null;
    }
  
    isEmpty() {
      if (this.head) {
        return false;
      } else {
        return true;
      }
    }
  
    insertAtBack(data) {
      if (this.isEmpty()) {
        this.head = new ListNode(data);
      } else {
        runner = this.head;
        while (runner.next) {
          runner = runner.next
        }
        runner.next = new ListNode(data);
      }
    }
  
    /**
   * Creates a new node with the given data and inserts that node at the front
   * of this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} data The data for the new node.
   * @returns {SinglyLinkedList} This list.
   */
    insertAtFront(data) {
      var new_node = new ListNode(data);
      new_node.next = this.head;
      this.head = new_node;
      console.log('node inserted')
      
      
      
      
    }
  
    /**
     * Removes the first node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the removed node.
     */
    removeHead() { }
  
    // EXTRA
    /**
     * Calculates the average of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {number|NaN} The average of the node's data.
     */
    average() { }
  
  
    /**
     * Calls insertAtBack on each item of the given array.
     * - Time: O(n * m) n = list length, m = arr.length.
     * - Space: O(1) constant.
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackMany(arrayOfValues, runner = this.head) {
      if (runner) {
        while (runner.next) {
          runner = runner.next
        }
      } else {
        this.head = new ListNode(arrayOfValues[0])
        runner = this.head
        arrayOfValues = arrayOfValues.filter((i) => i != arrayOfValues[0])
      }
      for (const val of arrayOfValues) {
        runner.next = new ListNode(val);
        runner = runner.next
      }
    }
  
    /**
     * Converts this list into an array containing the data of each node.
     * - Time: O(n) linear.
     * - Space: O(n).
     * @returns {Array<any>} An array of each node's data.
     */
    toArr() {
      const arr = [];
      let runner = this.head;
  
      while (runner) {
        arr.push(runner.data);
        runner = runner.next;
      }
      return arr;
    }
  }
  
  /******************************************************************* 
  */
  // const emptyList = new SinglyLinkedList();
  
  // const list1 = new SinglyLinkedList()
  // list1.insertAtBackMany([44, 56, 87])
  
  // const list2 = new SinglyLinkedList()
  // list2.insertAtBackMany([3, 8, 7, 9, 8, 9])
  
  // const list3 = new SinglyLinkedList()
  // list3.insertAtBackMany([100])
  
  const list4 = new SinglyLinkedList();
  list4.insertAtFront([110])
  
  
  
  
  
  