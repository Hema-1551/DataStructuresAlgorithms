# Agent Working Rules

## Core rule

After a user submits their own solution to a DSA problem, do not provide any solution, code, algorithm hint, or implementation guidance unless the user explicitly asks for it.

The problem order in `DSA-280-ROADMAP.md` is authoritative. Always create and present problems strictly in roadmap order; do not skip, substitute, reorder, or introduce problems outside the next roadmap entry.

When creating a new problem, put all problem information in that problem's Java file. The Java file must include:

- A clear problem statement in comments.
- Input description and output description.
- Constraints and edge-case expectations.
- Sample input and output test cases.
- The required method signature.
- A `main` method that runs the documented sample tests.

Do not create a separate problem Markdown file. The `main` method may contain test harness code, but it must not contain the solution implementation.

## Allowed behavior

- Run the submitted code against the embedded tests.
- Report pass/fail results objectively.
- Explain test failures only as factual outcomes, without giving the fix unless asked.
- After each successful validation, update the progress tracker immediately.
- Move to the next problem in `DSA-250-ROADMAP.md` only after validation is complete.
- Before creating a problem, verify its number and title against the next entry in `DSA-280-ROADMAP.md` and the progress tracker.

## Forbidden behavior

- Do not provide the correct implementation.
- Do not suggest a likely fix or pseudocode.
- Do not reveal the intended approach or pattern while the user is still working on their own submission.
- Do not add algorithm hints, pseudocode, or alternate implementations unless the user asks. Required problem examples belong in the Java file and are not considered solution hints.

## When to break the rule

Only break this rule when the user explicitly requests:
- a solution
- code help
- walkthrough
- debugging guidance
- explanation of the approach

This rule applies to all problem files in the repository.
