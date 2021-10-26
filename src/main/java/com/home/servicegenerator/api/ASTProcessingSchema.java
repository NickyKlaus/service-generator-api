package com.home.servicegenerator.api;

import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.modules.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.type.*;

import java.util.function.BiFunction;

public interface ASTProcessingSchema {
    default BiFunction<CompilationUnit, Object, CompilationUnit> preProcessCompilationUnit() {
        return (n, arg) -> n;
    }

    default BiFunction<PackageDeclaration, Object, PackageDeclaration> preProcessPackageDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TypeParameter, Object, TypeParameter> preProcessTypeParameter() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LineComment, Object, LineComment> preProcessLineComment() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BlockComment, Object, BlockComment> preProcessBlockComment() {
        return (n ,arg) -> n;
    }
    
    default BiFunction<ClassOrInterfaceDeclaration, Object, ClassOrInterfaceDeclaration> preProcessClassOrInterfaceDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EnumDeclaration, Object, EnumDeclaration> preProcessEnumDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EnumConstantDeclaration, Object, EnumConstantDeclaration> preProcessEnumConstantDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AnnotationDeclaration, Object, AnnotationDeclaration> preProcessAnnotationDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AnnotationMemberDeclaration, Object, AnnotationMemberDeclaration> preProcessAnnotationMemberDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<FieldDeclaration, Object, FieldDeclaration> preProcessFieldDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VariableDeclarator, Object, VariableDeclarator> preProcessVariableDeclarator() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ConstructorDeclaration, Object, ConstructorDeclaration> preProcessConstructorDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MethodDeclaration, Object, MethodDeclaration> preProcessMethodDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<Parameter, Object, Parameter> preProcessParameter() {
        return (n, arg) -> n;
    }
    
    default BiFunction<InitializerDeclaration, Object, InitializerDeclaration> preProcessInitializerDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<JavadocComment, Object, JavadocComment> preProcessJavadocComment() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ClassOrInterfaceType, Object, ClassOrInterfaceType> preProcessClassOrInterfaceType() {
        return (n ,arg) -> n;
    }
    
    default BiFunction<PrimitiveType, Object, PrimitiveType> preProcessPrimitiveType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayType, Object, ArrayType> preProcessArrayType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayCreationLevel, Object, ArrayCreationLevel> preProcessArrayCreationLevel() {
        return (n, arg) -> n;
    }
    
    default BiFunction<IntersectionType, Object, IntersectionType> preProcessIntersectionType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnionType, Object, UnionType> preProcessUnionType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VoidType, Object, VoidType> preProcessVoidType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<WildcardType, Object, WildcardType> preProcessWildcardType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnknownType, Object, UnknownType> preProcessUnknownType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayAccessExpr, Object, ArrayAccessExpr> preProcessArrayAccessExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayCreationExpr, Object, ArrayCreationExpr> preProcessArrayCreationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayInitializerExpr, Object, ArrayInitializerExpr> preProcessArrayInitializerExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AssignExpr, Object, AssignExpr> preProcessAssignExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BinaryExpr, Object, BinaryExpr> preProcessBinaryExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CastExpr, Object, CastExpr> preProcessCastExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ClassExpr, Object, ClassExpr> preProcessClassExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ConditionalExpr, Object, ConditionalExpr> preProcessConditionalExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EnclosedExpr, Object, EnclosedExpr> preProcessEnclosedExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<FieldAccessExpr, Object, FieldAccessExpr> preProcessFieldAccessExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<InstanceOfExpr, Object, InstanceOfExpr> preProcessInstanceOfExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<StringLiteralExpr, Object, StringLiteralExpr> preProcessStringLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<IntegerLiteralExpr, Object, IntegerLiteralExpr> preProcessIntegerLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LongLiteralExpr, Object, LongLiteralExpr> preProcessLongLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CharLiteralExpr, Object, CharLiteralExpr> preProcessCharLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<DoubleLiteralExpr, Object, DoubleLiteralExpr> preProcessDoubleLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BooleanLiteralExpr, Object, BooleanLiteralExpr> preProcessBooleanLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<NullLiteralExpr, Object, NullLiteralExpr> preProcessNullLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MethodCallExpr, Object, MethodCallExpr> preProcessMethodCallExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<NameExpr, Object, NameExpr> preProcessNameExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ObjectCreationExpr, Object, ObjectCreationExpr> preProcessObjectCreationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<Name, Object, Name> preProcessName() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SimpleName, Object, SimpleName> preProcessSimpleName() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ThisExpr, Object, ThisExpr> preProcessThisExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SuperExpr, Object, SuperExpr> preProcessSuperExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnaryExpr, Object, UnaryExpr> preProcessUnaryExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VariableDeclarationExpr, Object, VariableDeclarationExpr> preProcessVariableDeclarationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MarkerAnnotationExpr, Object, MarkerAnnotationExpr> preProcessMarkerAnnotationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SingleMemberAnnotationExpr, Object, SingleMemberAnnotationExpr> preProcessSingleMemberAnnotationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<NormalAnnotationExpr, Object, NormalAnnotationExpr> preProcessNormalAnnotationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MemberValuePair, Object, MemberValuePair> preProcessMemberValuePair() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ExplicitConstructorInvocationStmt, Object, ExplicitConstructorInvocationStmt> preProcessExplicitConstructorInvocationStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LocalClassDeclarationStmt, Object, LocalClassDeclarationStmt> preProcessLocalClassDeclarationStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LocalRecordDeclarationStmt, Object, LocalRecordDeclarationStmt> preProcessLocalRecordDeclarationStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AssertStmt, Object, AssertStmt> preProcessAssertStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BlockStmt, Object, BlockStmt> preProcessBlockStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LabeledStmt, Object, LabeledStmt> preProcessLabeledStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EmptyStmt, Object, EmptyStmt> preProcessEmptyStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ExpressionStmt, Object, ExpressionStmt> preProcessExpressionStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SwitchStmt, Object, SwitchStmt> preProcessSwitchStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SwitchEntry, Object, SwitchEntry> preProcessSwitchEntry() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BreakStmt, Object, BreakStmt> preProcessBreakStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ReturnStmt, Object, ReturnStmt> preProcessReturnStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<IfStmt, Object, IfStmt> preProcessIfStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<WhileStmt, Object, WhileStmt> preProcessWhileStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ContinueStmt, Object, ContinueStmt> preProcessContinueStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<DoStmt, Object, DoStmt> preProcessDoStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ForEachStmt, Object, ForEachStmt> preProcessForEachStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ForStmt, Object, ForStmt> preProcessForStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ThrowStmt, Object, ThrowStmt> preProcessThrowStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SynchronizedStmt, Object, SynchronizedStmt> preProcessSynchronizedStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TryStmt, Object, TryStmt> preProcessTryStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CatchClause, Object, CatchClause> preProcessCatchClause() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LambdaExpr, Object, LambdaExpr> preProcessLambdaExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MethodReferenceExpr, Object, MethodReferenceExpr> preProcessMethodReferenceExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TypeExpr, Object, TypeExpr> preProcessTypeExpr() {
        return (n, arg) -> n;
    }
    
    default <N extends Node> BiFunction<NodeList<N>, Object, NodeList<N>> preProcessNodeList() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ImportDeclaration, Object, Node> preProcessImportDeclaration() {
        return (n, arg) -> (Node) n;
    }
    
    default BiFunction<ModuleDeclaration, Object, ModuleDeclaration> preProcessModuleDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleRequiresDirective, Object, ModuleRequiresDirective> preProcessModuleRequiresDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleExportsDirective, Object, ModuleExportsDirective> preProcessModuleExportsDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleProvidesDirective, Object, ModuleProvidesDirective> preProcessModuleProvidesDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleUsesDirective, Object, ModuleUsesDirective> preProcessModuleUsesDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleOpensDirective, Object, ModuleOpensDirective> preProcessModuleOpensDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnparsableStmt, Object, UnparsableStmt> preProcessUnparsableStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ReceiverParameter, Object, ReceiverParameter> preProcessReceiverParameter() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VarType, Object, VarType> preProcessVarType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<Modifier, Object, Modifier> preProcessModifier() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SwitchExpr, Object, SwitchExpr> preProcessSwitchExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<YieldStmt, Object, YieldStmt> preProcessYieldStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TextBlockLiteralExpr, Object, TextBlockLiteralExpr> preProcessTextBlockLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<PatternExpr, Object, PatternExpr> preProcessPatternExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<RecordDeclaration, Object, RecordDeclaration> preProcessRecordDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CompactConstructorDeclaration, Object, CompactConstructorDeclaration> preProcessCompactConstructorDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<CompilationUnit, Object, CompilationUnit> postProcessCompilationUnit() {
        return (n, arg) -> n;
    }

    default BiFunction<PackageDeclaration, Object, PackageDeclaration> postProcessPackageDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<TypeParameter, Object, TypeParameter> postProcessTypeParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<LineComment, Object, LineComment> postProcessLineComment() {
        return (n, arg) -> n;
    }

    default BiFunction<BlockComment, Object, BlockComment> postProcessBlockComment() {
        return (n ,arg) -> n;
    }

    default BiFunction<ClassOrInterfaceDeclaration, Object, ClassOrInterfaceDeclaration> postProcessClassOrInterfaceDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<EnumDeclaration, Object, EnumDeclaration> postProcessEnumDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<EnumConstantDeclaration, Object, EnumConstantDeclaration> postProcessEnumConstantDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<AnnotationDeclaration, Object, AnnotationDeclaration> postProcessAnnotationDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<AnnotationMemberDeclaration, Object, AnnotationMemberDeclaration> postProcessAnnotationMemberDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<FieldDeclaration, Object, FieldDeclaration> postProcessFieldDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<VariableDeclarator, Object, VariableDeclarator> postProcessVariableDeclarator() {
        return (n, arg) -> n;
    }

    default BiFunction<ConstructorDeclaration, Object, ConstructorDeclaration> postProcessConstructorDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodDeclaration, Object, MethodDeclaration> postProcessMethodDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<Parameter, Object, Parameter> postProcessParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<InitializerDeclaration, Object, InitializerDeclaration> postProcessInitializerDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<JavadocComment, Object, JavadocComment> postProcessJavadocComment() {
        return (n, arg) -> n;
    }

    default BiFunction<ClassOrInterfaceType, Object, ClassOrInterfaceType> postProcessClassOrInterfaceType() {
        return (n ,arg) -> n;
    }

    default BiFunction<PrimitiveType, Object, PrimitiveType> postProcessPrimitiveType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayType, Object, ArrayType> postProcessArrayType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayCreationLevel, Object, ArrayCreationLevel> postProcessArrayCreationLevel() {
        return (n, arg) -> n;
    }

    default BiFunction<IntersectionType, Object, IntersectionType> postProcessIntersectionType() {
        return (n, arg) -> n;
    }

    default BiFunction<UnionType, Object, UnionType> postProcessUnionType() {
        return (n, arg) -> n;
    }

    default BiFunction<VoidType, Object, VoidType> postProcessVoidType() {
        return (n, arg) -> n;
    }

    default BiFunction<WildcardType, Object, WildcardType> postProcessWildcardType() {
        return (n, arg) -> n;
    }

    default BiFunction<UnknownType, Object, UnknownType> postProcessUnknownType() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayAccessExpr, Object, ArrayAccessExpr> postProcessArrayAccessExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayCreationExpr, Object, ArrayCreationExpr> postProcessArrayCreationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ArrayInitializerExpr, Object, ArrayInitializerExpr> postProcessArrayInitializerExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<AssignExpr, Object, AssignExpr> postProcessAssignExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<BinaryExpr, Object, BinaryExpr> postProcessBinaryExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<CastExpr, Object, CastExpr> postProcessCastExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ClassExpr, Object, ClassExpr> postProcessClassExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ConditionalExpr, Object, ConditionalExpr> postProcessConditionalExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<EnclosedExpr, Object, EnclosedExpr> postProcessEnclosedExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<FieldAccessExpr, Object, FieldAccessExpr> postProcessFieldAccessExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<InstanceOfExpr, Object, InstanceOfExpr> postProcessInstanceOfExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<StringLiteralExpr, Object, StringLiteralExpr> postProcessStringLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<IntegerLiteralExpr, Object, IntegerLiteralExpr> postProcessIntegerLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<LongLiteralExpr, Object, LongLiteralExpr> postProcessLongLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<CharLiteralExpr, Object, CharLiteralExpr> postProcessCharLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<DoubleLiteralExpr, Object, DoubleLiteralExpr> postProcessDoubleLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<BooleanLiteralExpr, Object, BooleanLiteralExpr> postProcessBooleanLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NullLiteralExpr, Object, NullLiteralExpr> postProcessNullLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodCallExpr, Object, MethodCallExpr> postProcessMethodCallExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NameExpr, Object, NameExpr> postProcessNameExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<ObjectCreationExpr, Object, ObjectCreationExpr> postProcessObjectCreationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<Name, Object, Name> postProcessName() {
        return (n, arg) -> n;
    }

    default BiFunction<SimpleName, Object, SimpleName> postProcessSimpleName() {
        return (n, arg) -> n;
    }

    default BiFunction<ThisExpr, Object, ThisExpr> postProcessThisExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<SuperExpr, Object, SuperExpr> postProcessSuperExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<UnaryExpr, Object, UnaryExpr> postProcessUnaryExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<VariableDeclarationExpr, Object, VariableDeclarationExpr> postProcessVariableDeclarationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MarkerAnnotationExpr, Object, MarkerAnnotationExpr> postProcessMarkerAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<SingleMemberAnnotationExpr, Object, SingleMemberAnnotationExpr> postProcessSingleMemberAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<NormalAnnotationExpr, Object, NormalAnnotationExpr> postProcessNormalAnnotationExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MemberValuePair, Object, MemberValuePair> postProcessMemberValuePair() {
        return (n, arg) -> n;
    }

    default BiFunction<ExplicitConstructorInvocationStmt, Object, ExplicitConstructorInvocationStmt> postProcessExplicitConstructorInvocationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LocalClassDeclarationStmt, Object, LocalClassDeclarationStmt> postProcessLocalClassDeclarationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LocalRecordDeclarationStmt, Object, LocalRecordDeclarationStmt> postProcessLocalRecordDeclarationStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<AssertStmt, Object, AssertStmt> postProcessAssertStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<BlockStmt, Object, BlockStmt> postProcessBlockStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<LabeledStmt, Object, LabeledStmt> postProcessLabeledStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<EmptyStmt, Object, EmptyStmt> postProcessEmptyStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ExpressionStmt, Object, ExpressionStmt> postProcessExpressionStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchStmt, Object, SwitchStmt> postProcessSwitchStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchEntry, Object, SwitchEntry> postProcessSwitchEntry() {
        return (n, arg) -> n;
    }

    default BiFunction<BreakStmt, Object, BreakStmt> postProcessBreakStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ReturnStmt, Object, ReturnStmt> postProcessReturnStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<IfStmt, Object, IfStmt> postProcessIfStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<WhileStmt, Object, WhileStmt> postProcessWhileStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ContinueStmt, Object, ContinueStmt> postProcessContinueStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<DoStmt, Object, DoStmt> postProcessDoStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ForEachStmt, Object, ForEachStmt> postProcessForEachStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ForStmt, Object, ForStmt> postProcessForStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ThrowStmt, Object, ThrowStmt> postProcessThrowStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<SynchronizedStmt, Object, SynchronizedStmt> postProcessSynchronizedStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<TryStmt, Object, TryStmt> postProcessTryStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<CatchClause, Object, CatchClause> postProcessCatchClause() {
        return (n, arg) -> n;
    }

    default BiFunction<LambdaExpr, Object, LambdaExpr> postProcessLambdaExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<MethodReferenceExpr, Object, MethodReferenceExpr> postProcessMethodReferenceExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<TypeExpr, Object, TypeExpr> postProcessTypeExpr() {
        return (n, arg) -> n;
    }

    default <N extends Node> BiFunction<NodeList<N>, Object, NodeList<N>> postProcessNodeList() {
        return (n, arg) -> n;
    }

    default BiFunction<ImportDeclaration, Object, Node> postProcessImportDeclaration() {
        return (n, arg) -> (Node) n;
    }

    default BiFunction<ModuleDeclaration, Object, ModuleDeclaration> postProcessModuleDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleRequiresDirective, Object, ModuleRequiresDirective> postProcessModuleRequiresDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleExportsDirective, Object, ModuleExportsDirective> postProcessModuleExportsDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleProvidesDirective, Object, ModuleProvidesDirective> postProcessModuleProvidesDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleUsesDirective, Object, ModuleUsesDirective> postProcessModuleUsesDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<ModuleOpensDirective, Object, ModuleOpensDirective> postProcessModuleOpensDirective() {
        return (n, arg) -> n;
    }

    default BiFunction<UnparsableStmt, Object, UnparsableStmt> postProcessUnparsableStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<ReceiverParameter, Object, ReceiverParameter> postProcessReceiverParameter() {
        return (n, arg) -> n;
    }

    default BiFunction<VarType, Object, VarType> postProcessVarType() {
        return (n, arg) -> n;
    }

    default BiFunction<Modifier, Object, Modifier> postProcessModifier() {
        return (n, arg) -> n;
    }

    default BiFunction<SwitchExpr, Object, SwitchExpr> postProcessSwitchExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<YieldStmt, Object, YieldStmt> postProcessYieldStmt() {
        return (n, arg) -> n;
    }

    default BiFunction<TextBlockLiteralExpr, Object, TextBlockLiteralExpr> postProcessTextBlockLiteralExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<PatternExpr, Object, PatternExpr> postProcessPatternExpr() {
        return (n, arg) -> n;
    }

    default BiFunction<RecordDeclaration, Object, RecordDeclaration> postProcessRecordDeclaration() {
        return (n, arg) -> n;
    }

    default BiFunction<CompactConstructorDeclaration, Object, CompactConstructorDeclaration> postProcessCompactConstructorDeclaration() {
        return (n, arg) -> n;
    }

}