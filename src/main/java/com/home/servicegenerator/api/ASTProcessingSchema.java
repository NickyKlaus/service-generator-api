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
    default BiFunction<CompilationUnit, Object, CompilationUnit> processCompilationUnit() {
        return (n, arg) -> n;
    }

    default BiFunction<PackageDeclaration, Object, PackageDeclaration> processPackageDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TypeParameter, Object, TypeParameter> processTypeParameter() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LineComment, Object, LineComment> processLineComment() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BlockComment, Object, BlockComment> processBlockComment() {
        return (n ,arg) -> n;
    }
    
    default BiFunction<ClassOrInterfaceDeclaration, Object, ClassOrInterfaceDeclaration> processClassOrInterfaceDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EnumDeclaration, Object, EnumDeclaration> processEnumDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EnumConstantDeclaration, Object, EnumConstantDeclaration> processEnumConstantDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AnnotationDeclaration, Object, AnnotationDeclaration> processAnnotationDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AnnotationMemberDeclaration, Object, AnnotationMemberDeclaration> processAnnotationMemberDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<FieldDeclaration, Object, FieldDeclaration> processFieldDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VariableDeclarator, Object, VariableDeclarator> processVariableDeclarator() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ConstructorDeclaration, Object, ConstructorDeclaration> processConstructorDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MethodDeclaration, Object, MethodDeclaration> processMethodDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<Parameter, Object, Parameter> processParameter() {
        return (n, arg) -> n;
    }
    
    default BiFunction<InitializerDeclaration, Object, InitializerDeclaration> processInitializerDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<JavadocComment, Object, JavadocComment> processJavadocComment() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ClassOrInterfaceType, Object, ClassOrInterfaceType> processClassOrInterfaceType() {
        return (n ,arg) -> n;
    }
    
    default BiFunction<PrimitiveType, Object, PrimitiveType> processPrimitiveType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayType, Object, ArrayType> processArrayType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayCreationLevel, Object, ArrayCreationLevel> processArrayCreationLevel() {
        return (n, arg) -> n;
    }
    
    default BiFunction<IntersectionType, Object, IntersectionType> processIntersectionType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnionType, Object, UnionType> processUnionType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VoidType, Object, VoidType> processVoidType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<WildcardType, Object, WildcardType> processWildcardType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnknownType, Object, UnknownType> processUnknownType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayAccessExpr, Object, ArrayAccessExpr> processArrayAccessExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayCreationExpr, Object, ArrayCreationExpr> processArrayCreationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ArrayInitializerExpr, Object, ArrayInitializerExpr> processArrayInitializerExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AssignExpr, Object, AssignExpr> processAssignExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BinaryExpr, Object, BinaryExpr> processBinaryExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CastExpr, Object, CastExpr> processCastExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ClassExpr, Object, ClassExpr> processClassExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ConditionalExpr, Object, ConditionalExpr> processConditionalExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EnclosedExpr, Object, EnclosedExpr> processEnclosedExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<FieldAccessExpr, Object, FieldAccessExpr> processFieldAccessExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<InstanceOfExpr, Object, InstanceOfExpr> processInstanceOfExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<StringLiteralExpr, Object, StringLiteralExpr> processStringLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<IntegerLiteralExpr, Object, IntegerLiteralExpr> processIntegerLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LongLiteralExpr, Object, LongLiteralExpr> processLongLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CharLiteralExpr, Object, CharLiteralExpr> processCharLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<DoubleLiteralExpr, Object, DoubleLiteralExpr> processDoubleLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BooleanLiteralExpr, Object, BooleanLiteralExpr> processBooleanLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<NullLiteralExpr, Object, NullLiteralExpr> processNullLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MethodCallExpr, Object, MethodCallExpr> processMethodCallExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<NameExpr, Object, NameExpr> processNameExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ObjectCreationExpr, Object, ObjectCreationExpr> processObjectCreationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<Name, Object, Name> processName() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SimpleName, Object, SimpleName> processSimpleName() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ThisExpr, Object, ThisExpr> processThisExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SuperExpr, Object, SuperExpr> processSuperExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnaryExpr, Object, UnaryExpr> processUnaryExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VariableDeclarationExpr, Object, VariableDeclarationExpr> processVariableDeclarationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MarkerAnnotationExpr, Object, MarkerAnnotationExpr> processMarkerAnnotationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SingleMemberAnnotationExpr, Object, SingleMemberAnnotationExpr> processSingleMemberAnnotationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<NormalAnnotationExpr, Object, NormalAnnotationExpr> processNormalAnnotationExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MemberValuePair, Object, MemberValuePair> processMemberValuePair() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ExplicitConstructorInvocationStmt, Object, ExplicitConstructorInvocationStmt> processExplicitConstructorInvocationStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LocalClassDeclarationStmt, Object, LocalClassDeclarationStmt> processLocalClassDeclarationStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LocalRecordDeclarationStmt, Object, LocalRecordDeclarationStmt> processLocalRecordDeclarationStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<AssertStmt, Object, AssertStmt> processAssertStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BlockStmt, Object, BlockStmt> processBlockStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LabeledStmt, Object, LabeledStmt> processLabeledStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<EmptyStmt, Object, EmptyStmt> processEmptyStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ExpressionStmt, Object, ExpressionStmt> processExpressionStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SwitchStmt, Object, SwitchStmt> processSwitchStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SwitchEntry, Object, SwitchEntry> processSwitchEntry() {
        return (n, arg) -> n;
    }
    
    default BiFunction<BreakStmt, Object, BreakStmt> processBreakStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ReturnStmt, Object, ReturnStmt> processReturnStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<IfStmt, Object, IfStmt> processIfStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<WhileStmt, Object, WhileStmt> processWhileStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ContinueStmt, Object, ContinueStmt> processContinueStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<DoStmt, Object, DoStmt> processDoStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ForEachStmt, Object, ForEachStmt> processForEachStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ForStmt, Object, ForStmt> processForStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ThrowStmt, Object, ThrowStmt> processThrowStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SynchronizedStmt, Object, SynchronizedStmt> processSynchronizedStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TryStmt, Object, TryStmt> processTryStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CatchClause, Object, CatchClause> processCatchClause() {
        return (n, arg) -> n;
    }
    
    default BiFunction<LambdaExpr, Object, LambdaExpr> processLambdaExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<MethodReferenceExpr, Object, MethodReferenceExpr> processMethodReferenceExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TypeExpr, Object, TypeExpr> processTypeExpr() {
        return (n, arg) -> n;
    }
    
    default <N extends Node> BiFunction<NodeList<N>, Object, NodeList<N>> processNodeList() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ImportDeclaration, Object, Node> processImportDeclaration() {
        return (n, arg) -> (Node) n;
    }
    
    default BiFunction<ModuleDeclaration, Object, ModuleDeclaration> processModuleDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleRequiresDirective, Object, ModuleRequiresDirective> processModuleRequiresDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleExportsDirective, Object, ModuleExportsDirective> processModuleExportsDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleProvidesDirective, Object, ModuleProvidesDirective> processModuleProvidesDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleUsesDirective, Object, ModuleUsesDirective> processModuleUsesDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ModuleOpensDirective, Object, ModuleOpensDirective> processModuleOpensDirective() {
        return (n, arg) -> n;
    }
    
    default BiFunction<UnparsableStmt, Object, UnparsableStmt> processUnparsableStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<ReceiverParameter, Object, ReceiverParameter> processReceiverParameter() {
        return (n, arg) -> n;
    }
    
    default BiFunction<VarType, Object, VarType> processVarType() {
        return (n, arg) -> n;
    }
    
    default BiFunction<Modifier, Object, Modifier> processModifier() {
        return (n, arg) -> n;
    }
    
    default BiFunction<SwitchExpr, Object, SwitchExpr> processSwitchExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<YieldStmt, Object, YieldStmt> processYieldStmt() {
        return (n, arg) -> n;
    }
    
    default BiFunction<TextBlockLiteralExpr, Object, TextBlockLiteralExpr> processTextBlockLiteralExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<PatternExpr, Object, PatternExpr> processPatternExpr() {
        return (n, arg) -> n;
    }
    
    default BiFunction<RecordDeclaration, Object, RecordDeclaration> processRecordDeclaration() {
        return (n, arg) -> n;
    }
    
    default BiFunction<CompactConstructorDeclaration, Object, CompactConstructorDeclaration> processCompactConstructorDeclaration() {
        return (n, arg) -> n;
    }
}