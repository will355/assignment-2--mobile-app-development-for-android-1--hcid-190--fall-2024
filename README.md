# Fall 2024 Mobile App Development for Android I — Assignment 2

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖ Before You Begin ❖

1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/). **Ensure you check the box that asks if you *only* want to copy the `DONT-WORK-HERE` branch**.
3. Launch your command line interface, or CLI.
4. Use `gh` to clone your repo: `gh repo clone USERNAME/REPO-NAME`, where `USERNAME` is *your* GitHub username, not mine, and `REPO-NAME` is the name of this repo.
5. Create a branch with your first name and last name, all lower case and separated by a dash (no spaces). For example, my branch would be called `roy-vanegas` and I’d create it as follows: `git checkout -b roy-vanegas`. For there to be an upstream branch, I’d then do, `git push --set-upstream origin roy-vanegas`.
6. Checkout our your new personalized branch. In my case, I’d do it as such: `git checkout roy-vanegas`.
7. Do all your work in your personalized branch.

---

## ❖ Assignment Description ❖

This assignment builds on the matrix flipping program you wrote for the first assignment. You’ll need to incorporate most of that program’s solution into this assignment as an Android project. I say “most” because instead of taking input from the command line to determine the size of the matrix, the input will need to come from the Android user interface, or UI. Thus, you’ll merge your Kotlin skills with your Android skills for the solution here.

---

## ❖ Rules ❖

1. Rename the `DONT-WORK-HERE` branch to your name, per the initial instructions above.
2. Initialize your app and save all its files in this repo. The included `.gitignore` file will allow into this repo the necessary files.
3. Launching your app in the Android simulator should present the user with an input box requesting the size of the matrix, much like the original assignment. The event should trigger a new scene in which the matrix is presented, based on the first assignment’s original rules. See below, which is a refresher of the original requirements. 
    1. Requests from the user a positive number representing the size of a matrix.
    2. Prints a matrix consisting of `0`s.
    3. Populates the matrix with values from `1–(input × input)`.
    4. Prints the matrix with the newly-populated values.
    5. Swaps the contents of the matrix on one side of the diagonal formed from top right to bottom left with the other side, highlighting the elements along the diagonal and leaving them untouched/unswapped.
    6. Prints the flipped matrix.

As mentioned in item 3.v, the elements in the diagonal **must not be touched**, while the other elements in the matrix **must be swapped**. The numbers in every cell of the matrix is arbitrary; each cell could have contained a letter, string, image, or other object/primitive. Numbers are being used in this assignment because they produce a sequence that is easy to follow when working with the matrix.

---

## ❖ Resources ❖

Do the following online learning tutorials in order to prepare for this project:

1. Android Basics with Compose **|** Unit 1: Your first Android app **|** [Build a basic layout](https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3)

2. Android Basics with Compose **|** Unit 2: Building app UI **|** [Kotlin fundamentals](https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-1)

3. Android Basics with Compose **|** Unit 2: Building app UI **|** [Add a button to an app](https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-2)

4. Android Basics with Compose **|** Unit 2: Building app UI **|** [Interacting with UI and state](https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-3)

5. [Create an input method](https://developer.android.com/develop/ui/views/touch-and-input/creating-input-method)

---

## ❖ Grading ❖

| Item                                                          | Points  |
|---------------------------------------------------------------|:-------:|
| Matrix program works according to instructions                | `25`    |
| Matrix solution implemented properly into the Android project | `25`    |
| All code is neat and professional                             | `25`    |
| All variable naming is logical                                | `25`    |

---

## ❖ Due ❖

Monday, 18 November 2024, at 5:00 PM.

---

## ❖ Submission ❖

You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may _only_ be submitted via GitHub. **No other form of submission will be accepted**.
