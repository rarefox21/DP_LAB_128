using System;

namespace TextEditor
{
    class Program
    {
        static void Main(string[] args)
        {
            TextEditor editor = new TextEditor();
            History history = new History(editor);

            editor.SetContent("Hello, World!");
            editor.SetCursorPosition(7);
            editor.AddSelection("Hello");

            history.Backup();  // Save state

            editor.SetContent("Modified content.");
            Console.WriteLine("Current State: ");
            editor.DisplayState();

            history.Undo(); // Restore previous state
            Console.WriteLine("After Undo: ");
            editor.DisplayState();
        }
    }
}