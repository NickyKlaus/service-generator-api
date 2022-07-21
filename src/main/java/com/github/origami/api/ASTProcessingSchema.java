package com.github.origami.api;

import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.modules.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.type.*;
import com.github.origami.api.context.Context;

import java.util.function.BiFunction;

public interface ASTProcessingSchema {
    default BiFunction<CompilationUnit, Context, CompilationUnit> preProcessCompilationUnit() {
        return (n, arg) -> n;
    }

    default BiFunction<PackageDeclaration, Context, PackageDeclaration> preProcessPackageDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<TypeParameter, Context, TypeParameter> preProcessTypeParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<LineComment, Context, LineComment> preProcessLineComment() {
        return (n, arg) -> n;
    }

    default BiFunction<BlockComment, Context, BlockComment> preProcessBlockComment() {
        return (n ,arg) -> n;
    }

    default BiFunction<ClassOrInterfaceDeclaration, Context, ClassOrInterfaceDeclaration> preProcessClassOrInterfaceDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<EnumDeclaration, Context, EnumDeclaration> preProcessEnumDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<EnumConstantDeclaration, Context, EnumConstantDeclaration> preProcessEnumConstantDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<AnnotationDeclaration, Context, AnnotationDeclaration> preProcessAnnotationDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<AnnotationMemberDeclaration, Context, AnnotationMemberDeclaration> preProcessAnnotationMemberDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<FieldDeclaration, Context, FieldDeclaration> preProcessFieldDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<VariableDeclarator, Context, VariableDeclarator> preProcessVariableDeclarator() {
        return (n, arg) -> n;
    }

    default BiFunction<ConstructorDeclaration, Context, ConstructorDeclaration> preProcessConstructorDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodDeclaration, Context, MethodDeclaration> preProcessMethodDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<Parameter, Context, Parameter> preProcessParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<InitializerDeclaration, Context, InitializerDeclaration> preProcessInitializerDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<JavadocComment, Context, JavadocComment> preProcessJavadocComment() {
        return (n, arg) -> n;
    }

    default BiFunction<ClassOrInterfaceType, Context, ClassOrInterfaceType> preProcessClassOrInterfaceType() {
        return (n ,arg) -> n;
    }

    default BiFunction<PrimitiveType, Context, PrimitiveType> preProcessPrimitiveType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayType, Context, ArrayType> preProcessArrayType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayCreationLevel, Context, ArrayCreationLevel> preProcessArrayCreationLevel() {
        return (n, arg) -> n;
    }

    default BiFunction<IntersectionType, Context, IntersectionType> preProcessIntersectionType() {
        return (n, arg) -> n;
    }

    default BiFunction<UnionType, Context, UnionType> preProcessUnionType() {
        return (n, arg) -> n;
    }

    default BiFunction<VoidType, Context, VoidType> preProcessVoidType() {
        return (n, arg) -> n;
    }

    default BiFunction<WildcardType, Context, WildcardType> preProcessWildcardType() {
        return (n, arg) -> n;
    }

    default BiFunction<UnknownType, Context, UnknownType> preProcessUnknownType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayAccessExpr, Context, ArrayAccessExpr> preProcessArrayAccessExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayCreationExpr, Context, ArrayCreationExpr> preProcessArrayCreationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayInitializerExpr, Context, ArrayInitializerExpr> preProcessArrayInitializerExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<AssignExpr, Context, AssignExpr> preProcessAssignExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<BinaryExpr, Context, BinaryExpr> preProcessBinaryExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<CastExpr, Context, CastExpr> preProcessCastExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ClassExpr, Context, ClassExpr> preProcessClassExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ConditionalExpr, Context, ConditionalExpr> preProcessConditionalExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<EnclosedExpr, Context, EnclosedExpr> preProcessEnclosedExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<FieldAccessExpr, Context, FieldAccessExpr> preProcessFieldAccessExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<InstanceOfExpr, Context, InstanceOfExpr> preProcessInstanceOfExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<StringLiteralExpr, Context, StringLiteralExpr> preProcessStringLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<IntegerLiteralExpr, Context, IntegerLiteralExpr> preProcessIntegerLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<LongLiteralExpr, Context, LongLiteralExpr> preProcessLongLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<CharLiteralExpr, Context, CharLiteralExpr> preProcessCharLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<DoubleLiteralExpr, Context, DoubleLiteralExpr> preProcessDoubleLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<BooleanLiteralExpr, Context, BooleanLiteralExpr> preProcessBooleanLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NullLiteralExpr, Context, NullLiteralExpr> preProcessNullLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodCallExpr, Context, MethodCallExpr> preProcessMethodCallExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NameExpr, Context, NameExpr> preProcessNameExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ObjectCreationExpr, Context, ObjectCreationExpr> preProcessObjectCreationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<Name, Context, Name> preProcessName() {
        return (n, arg) -> n;
    }

    default BiFunction<SimpleName, Context, SimpleName> preProcessSimpleName() {
        return (n, arg) -> n;
    }

    default BiFunction<ThisExpr, Context, ThisExpr> preProcessThisExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<SuperExpr, Context, SuperExpr> preProcessSuperExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<UnaryExpr, Context, UnaryExpr> preProcessUnaryExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<VariableDeclarationExpr, Context, VariableDeclarationExpr> preProcessVariableDeclarationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MarkerAnnotationExpr, Context, MarkerAnnotationExpr> preProcessMarkerAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<SingleMemberAnnotationExpr, Context, SingleMemberAnnotationExpr> preProcessSingleMemberAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NormalAnnotationExpr, Context, NormalAnnotationExpr> preProcessNormalAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MemberValuePair, Context, MemberValuePair> preProcessMemberValuePair() {
        return (n, arg) -> n;
    }

    default BiFunction<ExplicitConstructorInvocationStmt, Context, ExplicitConstructorInvocationStmt> preProcessExplicitConstructorInvocationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LocalClassDeclarationStmt, Context, LocalClassDeclarationStmt> preProcessLocalClassDeclarationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LocalRecordDeclarationStmt, Context, LocalRecordDeclarationStmt> preProcessLocalRecordDeclarationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<AssertStmt, Context, AssertStmt> preProcessAssertStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<BlockStmt, Context, BlockStmt> preProcessBlockStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LabeledStmt, Context, LabeledStmt> preProcessLabeledStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<EmptyStmt, Context, EmptyStmt> preProcessEmptyStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ExpressionStmt, Context, ExpressionStmt> preProcessExpressionStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchStmt, Context, SwitchStmt> preProcessSwitchStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchEntry, Context, SwitchEntry> preProcessSwitchEntry() {
        return (n, arg) -> n;
    }

    default BiFunction<BreakStmt, Context, BreakStmt> preProcessBreakStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ReturnStmt, Context, ReturnStmt> preProcessReturnStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<IfStmt, Context, IfStmt> preProcessIfStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<WhileStmt, Context, WhileStmt> preProcessWhileStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ContinueStmt, Context, ContinueStmt> preProcessContinueStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<DoStmt, Context, DoStmt> preProcessDoStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ForEachStmt, Context, ForEachStmt> preProcessForEachStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ForStmt, Context, ForStmt> preProcessForStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ThrowStmt, Context, ThrowStmt> preProcessThrowStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SynchronizedStmt, Context, SynchronizedStmt> preProcessSynchronizedStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<TryStmt, Context, TryStmt> preProcessTryStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<CatchClause, Context, CatchClause> preProcessCatchClause() {
        return (n, arg) -> n;
    }

    default BiFunction<LambdaExpr, Context, LambdaExpr> preProcessLambdaExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodReferenceExpr, Context, MethodReferenceExpr> preProcessMethodReferenceExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<TypeExpr, Context, TypeExpr> preProcessTypeExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NodeList<?>, Context, NodeList<?>> preProcessNodeList() {
        return (n, arg) -> n;
    }

    default BiFunction<ImportDeclaration, Context, Node> preProcessImportDeclaration() {
        return (n, arg) -> (Node) n;
    }

    default BiFunction<ModuleDeclaration, Context, ModuleDeclaration> preProcessModuleDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleRequiresDirective, Context, ModuleRequiresDirective> preProcessModuleRequiresDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleExportsDirective, Context, ModuleExportsDirective> preProcessModuleExportsDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleProvidesDirective, Context, ModuleProvidesDirective> preProcessModuleProvidesDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleUsesDirective, Context, ModuleUsesDirective> preProcessModuleUsesDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleOpensDirective, Context, ModuleOpensDirective> preProcessModuleOpensDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<UnparsableStmt, Context, UnparsableStmt> preProcessUnparsableStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ReceiverParameter, Context, ReceiverParameter> preProcessReceiverParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<VarType, Context, VarType> preProcessVarType() {
        return (n, arg) -> n;
    }

    default BiFunction<Modifier, Context, Modifier> preProcessModifier() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchExpr, Context, SwitchExpr> preProcessSwitchExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<YieldStmt, Context, YieldStmt> preProcessYieldStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<TextBlockLiteralExpr, Context, TextBlockLiteralExpr> preProcessTextBlockLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<PatternExpr, Context, PatternExpr> preProcessPatternExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<RecordDeclaration, Context, RecordDeclaration> preProcessRecordDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<CompactConstructorDeclaration, Context, CompactConstructorDeclaration> preProcessCompactConstructorDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<CompilationUnit, Context, CompilationUnit> postProcessCompilationUnit() {
        return (n, arg) -> n;
    }

    default BiFunction<PackageDeclaration, Context, PackageDeclaration> postProcessPackageDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<TypeParameter, Context, TypeParameter> postProcessTypeParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<LineComment, Context, LineComment> postProcessLineComment() {
        return (n, arg) -> n;
    }

    default BiFunction<BlockComment, Context, BlockComment> postProcessBlockComment() {
        return (n ,arg) -> n;
    }

    default BiFunction<ClassOrInterfaceDeclaration, Context, ClassOrInterfaceDeclaration> postProcessClassOrInterfaceDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<EnumDeclaration, Context, EnumDeclaration> postProcessEnumDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<EnumConstantDeclaration, Context, EnumConstantDeclaration> postProcessEnumConstantDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<AnnotationDeclaration, Context, AnnotationDeclaration> postProcessAnnotationDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<AnnotationMemberDeclaration, Context, AnnotationMemberDeclaration> postProcessAnnotationMemberDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<FieldDeclaration, Context, FieldDeclaration> postProcessFieldDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<VariableDeclarator, Context, VariableDeclarator> postProcessVariableDeclarator() {
        return (n, arg) -> n;
    }

    default BiFunction<ConstructorDeclaration, Context, ConstructorDeclaration> postProcessConstructorDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodDeclaration, Context, MethodDeclaration> postProcessMethodDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<Parameter, Context, Parameter> postProcessParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<InitializerDeclaration, Context, InitializerDeclaration> postProcessInitializerDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<JavadocComment, Context, JavadocComment> postProcessJavadocComment() {
        return (n, arg) -> n;
    }

    default BiFunction<ClassOrInterfaceType, Context, ClassOrInterfaceType> postProcessClassOrInterfaceType() {
        return (n ,arg) -> n;
    }

    default BiFunction<PrimitiveType, Context, PrimitiveType> postProcessPrimitiveType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayType, Context, ArrayType> postProcessArrayType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayCreationLevel, Context, ArrayCreationLevel> postProcessArrayCreationLevel() {
        return (n, arg) -> n;
    }

    default BiFunction<IntersectionType, Context, IntersectionType> postProcessIntersectionType() {
        return (n, arg) -> n;
    }

    default BiFunction<UnionType, Context, UnionType> postProcessUnionType() {
        return (n, arg) -> n;
    }

    default BiFunction<VoidType, Context, VoidType> postProcessVoidType() {
        return (n, arg) -> n;
    }

    default BiFunction<WildcardType, Context, WildcardType> postProcessWildcardType() {
        return (n, arg) -> n;
    }

    default BiFunction<UnknownType, Context, UnknownType> postProcessUnknownType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayAccessExpr, Context, ArrayAccessExpr> postProcessArrayAccessExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayCreationExpr, Context, ArrayCreationExpr> postProcessArrayCreationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayInitializerExpr, Context, ArrayInitializerExpr> postProcessArrayInitializerExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<AssignExpr, Context, AssignExpr> postProcessAssignExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<BinaryExpr, Context, BinaryExpr> postProcessBinaryExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<CastExpr, Context, CastExpr> postProcessCastExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ClassExpr, Context, ClassExpr> postProcessClassExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ConditionalExpr, Context, ConditionalExpr> postProcessConditionalExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<EnclosedExpr, Context, EnclosedExpr> postProcessEnclosedExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<FieldAccessExpr, Context, FieldAccessExpr> postProcessFieldAccessExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<InstanceOfExpr, Context, InstanceOfExpr> postProcessInstanceOfExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<StringLiteralExpr, Context, StringLiteralExpr> postProcessStringLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<IntegerLiteralExpr, Context, IntegerLiteralExpr> postProcessIntegerLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<LongLiteralExpr, Context, LongLiteralExpr> postProcessLongLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<CharLiteralExpr, Context, CharLiteralExpr> postProcessCharLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<DoubleLiteralExpr, Context, DoubleLiteralExpr> postProcessDoubleLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<BooleanLiteralExpr, Context, BooleanLiteralExpr> postProcessBooleanLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NullLiteralExpr, Context, NullLiteralExpr> postProcessNullLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodCallExpr, Context, MethodCallExpr> postProcessMethodCallExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NameExpr, Context, NameExpr> postProcessNameExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ObjectCreationExpr, Context, ObjectCreationExpr> postProcessObjectCreationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<Name, Context, Name> postProcessName() {
        return (n, arg) -> n;
    }

    default BiFunction<SimpleName, Context, SimpleName> postProcessSimpleName() {
        return (n, arg) -> n;
    }

    default BiFunction<ThisExpr, Context, ThisExpr> postProcessThisExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<SuperExpr, Context, SuperExpr> postProcessSuperExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<UnaryExpr, Context, UnaryExpr> postProcessUnaryExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<VariableDeclarationExpr, Context, VariableDeclarationExpr> postProcessVariableDeclarationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MarkerAnnotationExpr, Context, MarkerAnnotationExpr> postProcessMarkerAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<SingleMemberAnnotationExpr, Context, SingleMemberAnnotationExpr> postProcessSingleMemberAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NormalAnnotationExpr, Context, NormalAnnotationExpr> postProcessNormalAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MemberValuePair, Context, MemberValuePair> postProcessMemberValuePair() {
        return (n, arg) -> n;
    }

    default BiFunction<ExplicitConstructorInvocationStmt, Context, ExplicitConstructorInvocationStmt> postProcessExplicitConstructorInvocationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LocalClassDeclarationStmt, Context, LocalClassDeclarationStmt> postProcessLocalClassDeclarationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LocalRecordDeclarationStmt, Context, LocalRecordDeclarationStmt> postProcessLocalRecordDeclarationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<AssertStmt, Context, AssertStmt> postProcessAssertStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<BlockStmt, Context, BlockStmt> postProcessBlockStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LabeledStmt, Context, LabeledStmt> postProcessLabeledStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<EmptyStmt, Context, EmptyStmt> postProcessEmptyStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ExpressionStmt, Context, ExpressionStmt> postProcessExpressionStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchStmt, Context, SwitchStmt> postProcessSwitchStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchEntry, Context, SwitchEntry> postProcessSwitchEntry() {
        return (n, arg) -> n;
    }

    default BiFunction<BreakStmt, Context, BreakStmt> postProcessBreakStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ReturnStmt, Context, ReturnStmt> postProcessReturnStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<IfStmt, Context, IfStmt> postProcessIfStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<WhileStmt, Context, WhileStmt> postProcessWhileStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ContinueStmt, Context, ContinueStmt> postProcessContinueStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<DoStmt, Context, DoStmt> postProcessDoStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ForEachStmt, Context, ForEachStmt> postProcessForEachStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ForStmt, Context, ForStmt> postProcessForStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ThrowStmt, Context, ThrowStmt> postProcessThrowStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SynchronizedStmt, Context, SynchronizedStmt> postProcessSynchronizedStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<TryStmt, Context, TryStmt> postProcessTryStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<CatchClause, Context, CatchClause> postProcessCatchClause() {
        return (n, arg) -> n;
    }

    default BiFunction<LambdaExpr, Context, LambdaExpr> postProcessLambdaExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodReferenceExpr, Context, MethodReferenceExpr> postProcessMethodReferenceExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<TypeExpr, Context, TypeExpr> postProcessTypeExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NodeList<?>, Context, NodeList<?>> postProcessNodeList() {
        return (n, arg) -> n;
    }

    default BiFunction<ImportDeclaration, Context, Node> postProcessImportDeclaration() {
        return (n, arg) -> (Node) n;
    }

    default BiFunction<ModuleDeclaration, Context, ModuleDeclaration> postProcessModuleDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleRequiresDirective, Context, ModuleRequiresDirective> postProcessModuleRequiresDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleExportsDirective, Context, ModuleExportsDirective> postProcessModuleExportsDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleProvidesDirective, Context, ModuleProvidesDirective> postProcessModuleProvidesDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleUsesDirective, Context, ModuleUsesDirective> postProcessModuleUsesDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleOpensDirective, Context, ModuleOpensDirective> postProcessModuleOpensDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<UnparsableStmt, Context, UnparsableStmt> postProcessUnparsableStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ReceiverParameter, Context, ReceiverParameter> postProcessReceiverParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<VarType, Context, VarType> postProcessVarType() {
        return (n, arg) -> n;
    }

    default BiFunction<Modifier, Context, Modifier> postProcessModifier() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchExpr, Context, SwitchExpr> postProcessSwitchExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<YieldStmt, Context, YieldStmt> postProcessYieldStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<TextBlockLiteralExpr, Context, TextBlockLiteralExpr> postProcessTextBlockLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<PatternExpr, Context, PatternExpr> postProcessPatternExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<RecordDeclaration, Context, RecordDeclaration> postProcessRecordDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<CompactConstructorDeclaration, Context, CompactConstructorDeclaration> postProcessCompactConstructorDeclaration() {
        return (n, arg) -> n;
    }
}