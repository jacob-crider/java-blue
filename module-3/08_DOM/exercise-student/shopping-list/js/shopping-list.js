const pageTitle = 'My Shopping List';

const groceries = ['milk', 'eggs', 'bread', 'butter', 'cereal', 'chicken', 'yogurt', 'bananas', 'blueberries', 'bagels'];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.querySelector('#title');
  title.innerText = pageTitle;

}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceriesList = document.querySelector('.shopping-list ul');

 for (let i = 0; i < groceries.length; i++) {
    const item = document.createElement('li');
      item.innerText = groceries[i];
      groceriesList.insertAdjacentElement('beforeend', item);
  }
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const item = document.querySelectorAll('.shopping-list ul li');
    item.forEach(element => {
      element.classList.add('completed');
    });
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
